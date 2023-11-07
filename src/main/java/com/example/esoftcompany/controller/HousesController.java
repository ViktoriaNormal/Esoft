package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
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
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/House.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/House.fxml");
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
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Apartments.fxml");
    }

    @FXML
    void toHouses(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Houses.fxml");
    }

    @FXML
    void toLivingComplexes(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Living_complexes.fxml");
    }

    @FXML
    void toReporting(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Reporting.fxml");
    }

    @FXML
    void initialize() {

    }

}

