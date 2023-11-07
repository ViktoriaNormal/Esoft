package com.example.esoftcompany.dao;

import com.example.esoftcompany.model.House;

public class HouseDao extends AbstractHibernateDao<House>{

    public HouseDao() {
        super(House.class);
    }
}
