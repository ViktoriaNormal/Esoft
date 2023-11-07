package com.example.esoftcompany.dao;

import com.example.esoftcompany.util.HibernateUtil;
import jakarta.persistence.RollbackException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public abstract class AbstractHibernateDao<T> {
    private final Class<T> clazz;
    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AbstractHibernateDao(final Class<T> clazzToSet)   {
        this.clazz = clazzToSet;
    }

    public T getById(long id) {
        Transaction transaction = null;
        T object;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            object = session.get(clazz, id);
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return object;
    }

    public List<T> getItems(int from, int count) {
        Transaction transaction = null;
        List<T> list;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            Query<T> query = getCurrentSession().createQuery("from " + clazz.getName(), clazz);
            query.setFirstResult(from);
            query.setMaxResults(count);
            list = query.getResultList();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<T> findAll() {
        Transaction transaction = null;
        List<T> list;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            list = session.createQuery("from " + clazz.getName(), clazz).list();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return list;
    }

    public int getCount() {
        Transaction transaction = null;
        int count = 0;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            count = getCurrentSession().createQuery("select count(*) from" + clazz.getName(),
                    Integer.class).uniqueResult();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return count;
    }

    public T create(T entity) {
        Transaction transaction = null;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.persist(entity);
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return entity;
    }

    public T update(T entity) {
        Transaction transaction = null;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.merge(entity);
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return entity;
    }

    public void delete(T entity) {
        Transaction transaction = null;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();

            if (entity != null)
               session.remove(entity);

            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
    }

    public void deleteById(long entityId) {
        Transaction transaction = null;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            T entity = getById(entityId);

            if (entity != null)
                session.remove(entity);

            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
