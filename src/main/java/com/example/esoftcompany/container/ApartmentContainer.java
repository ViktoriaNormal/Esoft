package com.example.esoftcompany.container;

import com.example.esoftcompany.dao.ApartmentDao;
import com.example.esoftcompany.model.Apartment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ApartmentContainer {

    private static ObservableList<Apartment> apartments;

    public ApartmentContainer() {
        ApartmentDao apartmentDao = new ApartmentDao();
        apartments = FXCollections.observableList(apartmentDao.findAll());
    }

    public ObservableList<Apartment> getApartments() {
        return apartments;
    }
}
