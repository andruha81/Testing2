package by.transport.model.dao.impl;

import by.transport.model.dao.IGenericDao;
import by.transport.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class GenericDao<T> implements IGenericDao<T> {

    private final Class<T> clazz;

    public GenericDao(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public void save(T entity) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void update(T entity) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(T entity) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
        em.close();
    }

    public T getById(int entityId) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        T entity = em.find(clazz, entityId);
        em.getTransaction().commit();
        em.close();
        return entity;
    }

    public List<T> getAll() {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        List<T> entities = em.createQuery("from " + clazz.getName()).getResultList();
        em.getTransaction().commit();
        em.close();
        return entities;
    }

    public void deleteById(int entityId) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        T entity = em.find(clazz, entityId);
        em.remove(entity);
        em.getTransaction().commit();
//        T entity = getById(entityId);
//        delete(entity);
    }
}
