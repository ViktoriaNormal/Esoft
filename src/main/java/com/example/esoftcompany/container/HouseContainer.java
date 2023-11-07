package com.example.esoftcompany.container;

import com.example.esoftcompany.dao.HouseDao;
import com.example.esoftcompany.model.House;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HouseContainer {

    private static ObservableList<House> houses;

    public HouseContainer() {
        HouseDao houseDao = new HouseDao();
        houses = FXCollections.observableList(houseDao.findAll());
    }

    public ObservableList<House> getHouses() {
        return houses;
    }
}
