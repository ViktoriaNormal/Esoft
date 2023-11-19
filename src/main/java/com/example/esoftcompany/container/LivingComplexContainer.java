package com.example.esoftcompany.container;

import com.example.esoftcompany.dao.LivingComplexDao;
import com.example.esoftcompany.model.LivingComplex;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LivingComplexContainer {

    private static ObservableList<LivingComplex> complexes;

    public LivingComplexContainer() {
        LivingComplexDao livingComplexDao = new LivingComplexDao();
        complexes = FXCollections.observableList(livingComplexDao.sortFindAll());
    }

    public ObservableList<LivingComplex> getComplexes() {
        return complexes;
    }

    public static int size() {
        return complexes.size();
    }
}
