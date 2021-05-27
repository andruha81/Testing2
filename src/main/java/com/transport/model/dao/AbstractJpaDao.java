package com.transport.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AbstractJpaDao<T> {

    private Class<T> clazz;

    @PersistenceContext
    EntityManager entityManager;

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public void save(T entity) {
        entityManager.persist(entity);
    }

    public void update(T entity) {
        entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    public T getById(int entityId) {
        return entityManager.find(clazz, entityId);
    }

    public List<T> getAll() {
        return entityManager.createQuery("from " + clazz.getName()).getResultList();
    }

    public void deleteById(int entityId) {
        T entity = getById(entityId);
        delete(entity);
    }

}
