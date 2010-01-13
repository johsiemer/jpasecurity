/*
 * Copyright 2008 Arne Limburg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package net.sf.jpasecurity.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import net.sf.jpasecurity.entity.FetchManager;
import net.sf.jpasecurity.entity.SecureEntity;
import net.sf.jpasecurity.entity.SecureObjectManager;
import net.sf.jpasecurity.jpql.compiler.PathEvaluator;
import net.sf.jpasecurity.mapping.TypeDefinition;
import net.sf.jpasecurity.util.ProxyInvocationHandler;


/**
 * This class handles invocations on queries.
 * @author Arne Limburg
 */
public class QueryInvocationHandler extends ProxyInvocationHandler<Query> {

    private SecureObjectManager objectManager;
    private FetchManager fetchManager;
    private List<String> selectedPaths;
    private Set<TypeDefinition> types;
    private PathEvaluator pathEvaluator;

    public QueryInvocationHandler(SecureObjectManager objectManager,
                                  FetchManager fetchManager,
                                  Query query,
                                  List<String> selectedPaths,
                                  Set<TypeDefinition> types,
                                  PathEvaluator pathEvaluator) {
        super(query);
        this.objectManager = objectManager;
        this.fetchManager = fetchManager;
        this.selectedPaths = selectedPaths;
        this.types = types;
        this.pathEvaluator = pathEvaluator;
    }

    public Query setParameter(int index, Object parameter) {
        if (parameter instanceof SecureEntity) {
            return ((SecureEntity)parameter).setParameter(getTarget(), index);
        } else {
            return getTarget().setParameter(index, parameter);
        }
    }

    public Query setParameter(String name, Object parameter) {
        if (parameter instanceof SecureEntity) {
            return ((SecureEntity)parameter).setParameter(getTarget(), name);
        } else {
            return getTarget().setParameter(name, parameter);
        }
    }

    public Object getSingleResult() {
        return getSecureResult(getTarget().getSingleResult());
    }

    public List getResultList() {
        List targetResult = getTarget().getResultList();
        List proxyResult = new ArrayList();
        for (Object entity: targetResult) {
            proxyResult.add(getSecureResult(entity));
        }
        return proxyResult;
    }

    private Object getSecureResult(Object result) {
        if (result instanceof String || result instanceof Long || result instanceof Integer
            || result instanceof Double || result instanceof Float || result instanceof Date) {
            return result;
        }
        if (!(result instanceof Object[])) {
            result = objectManager.getSecureObject(result);
            if (selectedPaths != null) {
                executeFetchPlan(result, selectedPaths.get(0));
            }
            return result;
        }
        Object[] scalarResult = (Object[])result;
        for (int i = 0; i < scalarResult.length; i++) {
            scalarResult[i] = objectManager.getSecureObject(scalarResult[i]);
            if (selectedPaths != null) {
                executeFetchPlan(scalarResult[i], selectedPaths.get(i));
            }
        }
        return scalarResult;
    }

    private void executeFetchPlan(Object entity, String selectedPath) {
        selectedPath = resolveAliases(selectedPath);
        fetchManager.fetch(entity, fetchManager.getMaximumFetchDepth() - getPathLength(selectedPath) + 1);
        for (TypeDefinition typeDefinition: types) {
            if (typeDefinition.isFetchJoin()) {
                String fetchPath = resolveAliases(typeDefinition.getJoinPath());
                if (fetchPath.startsWith(selectedPath)) {
                    Object result = pathEvaluator.evaluate(entity, fetchPath.substring(selectedPath.length() + 1));
                    fetchManager.fetch(result, fetchManager.getMaximumFetchDepth() - getPathLength(fetchPath) + 1);
                }
            }
        }
    }

    private String resolveAliases(String aliasedPath) {
        int index = aliasedPath.indexOf('.');
        String alias, path;
        if (index == -1) {
            alias = aliasedPath;
            path = null;
        } else {
            alias = aliasedPath.substring(0, index);
            path = aliasedPath.substring(index + 1);
        }
        for (TypeDefinition typeDefinition: types) {
            if (alias.equals(typeDefinition.getAlias())) {
                if (typeDefinition.getJoinPath() == null) {
                    return aliasedPath;
                }
                return resolveAliases(typeDefinition.getJoinPath() + '.' + path);
            }
        }
        throw new IllegalStateException("alias '" + alias + "' not found in type definitions");
    }

    private int getPathLength(String path) {
        int pathLength = 1;
        for (int index = path.indexOf('.'); index != -1; index = path.indexOf('.', index + 1)) {
            pathLength++;
        }
        return pathLength;
    }
}