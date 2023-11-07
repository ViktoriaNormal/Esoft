package com.example.esoftcompany.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public abstract class AbstractHibernateDao<T> {
    private final Class<T> clazz;
    private SessionFactory sessionFactory;

    protected AbstractHibernateDao(final Class<T> clazzToSet)   {
        this.clazz = clazzToSet;
    }

    protected T getById(final long id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    protected List<T> getItems(int from, int count) {
        Query<T> query = getCurrentSession().createQuery("from " + clazz.getName(), clazz);
        query.setFirstResult(from);
        query.setMaxResults(count);
        return query.getResultList();
    }

    protected List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName(), clazz).list();
    }

    protected int getCount() {
        return getCurrentSession().createQuery("select count(*) from" + clazz.getName(), Integer.class).uniqueResult();
    }

    public T create(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }

    public T update(final T entity) {
        return (T) getCurrentSession().merge(entity);
    }

    public void delete(final T entity) {
        getCurrentSession().delete(entity);
    }

    public void deleteById(final long entityId) {
        final T entity = getById(entityId);
        delete(entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
