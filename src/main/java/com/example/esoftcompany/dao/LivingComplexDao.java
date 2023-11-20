package com.example.esoftcompany.dao;

import com.example.esoftcompany.model.LivingComplex;
import com.example.esoftcompany.util.HibernateUtil;
import jakarta.persistence.RollbackException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class LivingComplexDao extends AbstractHibernateDao<LivingComplex> {

    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public LivingComplexDao() {
        super(LivingComplex.class);
    }

    public int counterHousesByComplex(LivingComplex livingComplex) {
        Transaction transaction = null;
        int count = 0;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            String hqlQuery = "select count(*) from House where complex = :livingComplex";
            Query<Integer> query = getCurrentSession().createQuery(hqlQuery, Integer.class);
            query.setParameter("livingComplex", livingComplex);
            count = query.getSingleResult();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return count;
    }

    public List<LivingComplex> sortFindAll() {
        Transaction transaction = null;
        List<LivingComplex> list;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            list = session.createQuery("from " + LivingComplex.class.getName() + " order by complex_city, " +
                    "case complex_status when 'plan' then 1 when 'construction' then 2 when 'built' then 3 else 4 end",
                    LivingComplex.class).list();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<String> getCityComplexes() {
        Transaction transaction = null;
        List<String> list;

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            list = session.createQuery("select distinct(complex_city) from " + LivingComplex.class.getName(),
                    String.class).list();
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<LivingComplex> filteredComplexes(String status, String city) {
        Transaction transaction = null;
        List<LivingComplex> list = null;
        String sorting = " order by complex_city, case complex_status when 'plan' then 1 when 'construction' " +
                "then 2 when 'built' then 3 else 4 end";
        String table_status = "";

        if(status != null) {
            table_status = switch (status) {
                case "Строящиеся" -> "construction";
                case "Планируемые" -> "plan";
                case "Построенные" -> "built";
                default -> null;
            };
        }

        try (Session session = this.sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();

            if(table_status != null && city != null) {
                String hql = "from LivingComplex where complex_status = :complexStatus and complex_city = :complexCity"
                        + sorting;
                Query<LivingComplex>  query = session.createQuery(hql, LivingComplex.class);
                query.setParameter("complexStatus", table_status);
                query.setParameter("complexCity", city);
                list = query.list();
            }

            else if (city == null && table_status != null) {
                String hql = "from LivingComplex where complex_status = :complexStatus" + sorting;
                Query<LivingComplex>  query = session.createQuery(hql, LivingComplex.class);
                query.setParameter("complexStatus", table_status);
                list = query.list();
            }

            else if (city != null) {
                String hql = "from LivingComplex where complex_city = :complexCity" + sorting;
                Query<LivingComplex>  query = session.createQuery(hql, LivingComplex.class);
                query.setParameter("complexCity", city);
                list = query.list();
            }
            transaction.commit();
        }
        catch (RollbackException ex) {
            if (transaction != null)
                transaction.rollback();

            throw new RuntimeException(ex);
        }
        return list;
    }

}
