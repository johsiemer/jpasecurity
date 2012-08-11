/*
 * Copyright 2012 Arne Limburg
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
package net.sf.jpasecurity.mapping;

import static net.sf.jpasecurity.util.Validate.notNull;

import net.sf.jpasecurity.jpql.parser.Node;

/**
 * @author Arne Limburg
 */
public class ConditionalPath extends Path {

    private Node condition;

    public ConditionalPath(String path, Node conditionNode) {
        super(path);
        notNull("Condition", conditionNode);
        condition = conditionNode.clone();
    }

    ConditionalPath(Alias alias, String subpath, Node conditionNode) {
        super(alias, subpath);
        notNull("Condition", conditionNode);
        condition = conditionNode.clone();
    }

    public Node getCondition() {
        return condition.clone();
    }

    public ConditionalPath newCondition(Node condition) {
        return new ConditionalPath(getRootAlias(), getSubpath(), condition);
    }

    public ConditionalPath getParentPath() {
        return new ConditionalPath(super.getParentPath().toString(), condition);
    }

    public String toString() {
        return "WHEN " + condition + " THEN " + super.toString();
    }
}
