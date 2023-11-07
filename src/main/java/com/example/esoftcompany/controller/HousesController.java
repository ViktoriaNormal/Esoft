package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HousesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address;

    @FXML
    private ComboBox<?> comboBoxComplex;

    @FXML
    private Button creation;

    @FXML
    private Button deletion;

    @FXML
    private Button editing;

    @FXML
    private TableView<?> housesTable;

    @FXML
    private Button navApartments;

    @FXML
    private Button navHouses;

    @FXML
    private Button navLivingComplexes;

    @FXML
    private Button navReporting;

    @FXML
    private TableColumn<?, ?> quantityApartmentsForSale;

    @FXML
    private TableColumn<?, ?> quantitySoldApartments;

    @FXML
    private TableColumn<?, ?> tableComplex;

    @FXML
    private TableColumn<?, ?> tableHouse;

    @FXML
    private TableColumn<?, ?> tableStatus;

    @FXML
    private TableColumn<?, ?> tableStreet;

    @FXML
    void createNewHouse(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {

    }

    @FXML
    void enterAddress(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceComplex(ActionEvent event) {

    }

    @FXML
    void sortHousesTable(ActionEvent event) {

    }

    @FXML
    void toApartments(ActionEvent event) {

    }

    @FXML
    void toHouses(ActionEvent event) {

    }

    @FXML
    void toLivingComplexes(ActionEvent event) {

    }

    @FXML
    void toReporting(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'Houses.fxml'.";
        assert comboBoxComplex != null : "fx:id=\"comboBoxComplex\" was not injected: check your FXML file 'Houses.fxml'.";
        assert creation != null : "fx:id=\"creation\" was not injected: check your FXML file 'Houses.fxml'.";
        assert deletion != null : "fx:id=\"deletion\" was not injected: check your FXML file 'Houses.fxml'.";
        assert editing != null : "fx:id=\"editing\" was not injected: check your FXML file 'Houses.fxml'.";
        assert housesTable != null : "fx:id=\"housesTable\" was not injected: check your FXML file 'Houses.fxml'.";
        assert navApartments != null : "fx:id=\"navApartments\" was not injected: check your FXML file 'Houses.fxml'.";
        assert navHouses != null : "fx:id=\"navHouses\" was not injected: check your FXML file 'Houses.fxml'.";
        assert navLivingComplexes != null : "fx:id=\"navLivingComplexes\" was not injected: check your FXML file 'Houses.fxml'.";
        assert navReporting != null : "fx:id=\"navReporting\" was not injected: check your FXML file 'Houses.fxml'.";
        assert quantityApartmentsForSale != null : "fx:id=\"quantityApartmentsForSale\" was not injected: check your FXML file 'Houses.fxml'.";
        assert quantitySoldApartments != null : "fx:id=\"quantitySoldApartments\" was not injected: check your FXML file 'Houses.fxml'.";
        assert tableComplex != null : "fx:id=\"tableComplex\" was not injected: check your FXML file 'Houses.fxml'.";
        assert tableHouse != null : "fx:id=\"tableHouse\" was not injected: check your FXML file 'Houses.fxml'.";
        assert tableStatus != null : "fx:id=\"tableStatus\" was not injected: check your FXML file 'Houses.fxml'.";
        assert tableStreet != null : "fx:id=\"tableStreet\" was not injected: check your FXML file 'Houses.fxml'.";

    }

}

