package com.example.esoftcompany.container;

import com.example.esoftcompany.dao.LivingComplexDao;
import com.example.esoftcompany.model.LivingComplex;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LivingComplexContainer {

    private static ObservableList<LivingComplex> complexes;

    public LivingComplexContainer() {
        LivingComplexDao livingComplexDao = new LivingComplexDao();
        complexes = FXCollections.observableList(livingComplexDao.findAll());
    }

    public ObservableList<LivingComplex> getHouses() {
        return complexes;
    }
}
