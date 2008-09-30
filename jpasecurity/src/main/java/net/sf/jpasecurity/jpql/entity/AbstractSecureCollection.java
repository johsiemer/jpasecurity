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

package net.sf.jpasecurity.entity;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import net.sf.jpasecurity.security.rules.AccessType;

/**
 * @author Arne Limburg
 * @param <E>
 */
public abstract class AbstractSecureCollection<E, T extends Collection<E>> extends AbstractCollection<E>
                                                                           implements SecureCollection<E> {

    private T original;
    private T filtered;
    private SecureEntityHandler entityHandler;
    
    public AbstractSecureCollection(T collection, SecureEntityHandler entityHandler) {
        this.original = collection;
        this.entityHandler = entityHandler;
    }
    
    /**
     * This constructor can be used to create an already initialized secure collection
     * @param original the original collection
     * @param filtered the (initialized) filtered collection
     * @param entityHandler the enityHandler
     */
    AbstractSecureCollection(T original, T filtered, SecureEntityHandler entityHandler) {
        this(original, entityHandler);
        this.filtered = filtered;
    }
    
    public Iterator<E> iterator() {
        return getFiltered().iterator();
    }
    
    public boolean add(E entity) {
        checkAccessible(entity, AccessType.UPDATE);//TODO create?
        if (getOriginal().add(entity)) {
            getFiltered().add(entity);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean addAll(Collection<? extends E> collection) {
        collection = filterAll(collection);
        boolean result = getFiltered().addAll(collection);
        getOriginal().addAll(collection);
        return result;
    }
    

    public boolean remove(Object entity) {
        if (getOriginal().remove(entity)) {
            getFiltered().remove(entity);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAll(Collection<?> collection) {
        boolean result = getFiltered().removeAll(collection);
        getOriginal().removeAll(collection);
        return result;
    }
    
    public boolean retainAll(Collection<?> collection) {
        boolean result = getFiltered().retainAll(collection);
        getOriginal().retainAll(collection);
        return result;
    }

    public void clear() {
        getFiltered().clear();
        getOriginal().clear();
    }

    public int size() {
        return getFiltered().size();
    }

    final SecureEntityHandler getEntityHandler() {
        return entityHandler;
    }
    
    final T getOriginal() {
        return original;
    }

    /**
     * Returns the filtered collection, initializing it when necessary.
     * @return the filtered collection
     */
    final T getFiltered() {
        checkInitialized();
        return filtered;
    }
    
    abstract T createFiltered();

    void checkAccessible(E entity, AccessType accessType) {
        if (!isAccessible(entity, accessType)) {
            throw new SecurityException("Entity may not be added");
        }        
    }
    
    boolean isAccessible(E entity, AccessType accessType) {
        return entityHandler.isAccessible(entity, accessType);
    }
    
    Collection<? extends E> filterAll(Collection<? extends E> collection) {
        Collection<E> filteredCollection = new ArrayList<E>(collection);
        for (Iterator<E> i = filteredCollection.iterator(); i.hasNext();) {
            if (!isAccessible(i.next(), AccessType.READ)) {
                i.remove();
            }
        }
        return filteredCollection;
    }

    private void checkInitialized() {
        if (filtered == null) {
            initialize();
        }        
    }
    
    private void initialize() {
        this.filtered = createFiltered();
        for (E entity: original) {
            if (isAccessible(entity, AccessType.READ)) {
                filtered.add(entityHandler.getSecureObject(entity));
            }
        }
    }
}
