package com.example.esoftcompany.dao;

import com.example.esoftcompany.model.Apartment;

public class ApartmentDao extends AbstractHibernateDao<Apartment> {

    public ApartmentDao() {
        super(Apartment.class);
    }
}
