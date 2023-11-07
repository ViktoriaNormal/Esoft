package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ApartmentsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> apartmentsTable;

    @FXML
    private Button begining;

    @FXML
    private ComboBox<?> comboBoxComplex;

    @FXML
    private ComboBox<?> comboBoxHouse;

    @FXML
    private Button creation;

    @FXML
    private Button deletion;

    @FXML
    private Button editing;

    @FXML
    private Button end;

    @FXML
    private ComboBox<?> floor;

    @FXML
    private Button navApartments;

    @FXML
    private Button navHouses;

    @FXML
    private Button navLivingComplexes;

    @FXML
    private Button navReporting;

    @FXML
    private Pagination pagination;

    @FXML
    private ComboBox<?> porch;

    @FXML
    private ChoiceBox<?> status;

    @FXML
    private TableColumn<?, ?> tableAddress;

    @FXML
    private TableColumn<?, ?> tableArea;

    @FXML
    private TableColumn<?, ?> tableComplex;

    @FXML
    private TableColumn<?, ?> tableFloor;

    @FXML
    private TableColumn<?, ?> tableNumberRooms;

    @FXML
    private TableColumn<?, ?> tablePorch;

    @FXML
    private TableColumn<?, ?> tableStatus;

    @FXML
    void createNewApartment(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Apartment.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Apartment.fxml");
    }

    @FXML
    void enterOrChoiceComplex(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceFloor(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceHouse(ActionEvent event) {

    }

    @FXML
    void enterOrChoicePorch(ActionEvent event) {

    }

    @FXML
    void sortApartmentsTable(ActionEvent event) {

    }

    @FXML
    void toBegining(ActionEvent event) {

    }

    @FXML
    void toEnd(ActionEvent event) {

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
