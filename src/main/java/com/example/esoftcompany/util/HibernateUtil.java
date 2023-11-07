package com.example.esoftcompany.util;

import com.example.esoftcompany.model.Apartment;
import com.example.esoftcompany.model.House;
import com.example.esoftcompany.model.LivingComplex;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

            return new Configuration()
                    .addAnnotatedClass(Apartment.class)
                    .addAnnotatedClass(House.class)
                    .addAnnotatedClass(LivingComplex.class)
                    .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

