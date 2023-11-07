package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;
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

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {

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
    void toApartments(ActionEvent event) {

    }

    @FXML
    void toBegining(ActionEvent event) {

    }

    @FXML
    void toEnd(ActionEvent event) {

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
        assert apartmentsTable != null : "fx:id=\"apartmentsTable\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert begining != null : "fx:id=\"begining\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert comboBoxComplex != null : "fx:id=\"comboBoxComplex\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert comboBoxHouse != null : "fx:id=\"comboBoxHouse\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert creation != null : "fx:id=\"creation\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert deletion != null : "fx:id=\"deletion\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert editing != null : "fx:id=\"editing\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert end != null : "fx:id=\"end\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert floor != null : "fx:id=\"floor\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert navApartments != null : "fx:id=\"navApartments\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert navHouses != null : "fx:id=\"navHouses\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert navLivingComplexes != null : "fx:id=\"navLivingComplexes\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert navReporting != null : "fx:id=\"navReporting\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert pagination != null : "fx:id=\"pagination\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert porch != null : "fx:id=\"porch\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableAddress != null : "fx:id=\"tableAddress\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableArea != null : "fx:id=\"tableArea\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableComplex != null : "fx:id=\"tableComplex\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableFloor != null : "fx:id=\"tableFloor\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableNumberRooms != null : "fx:id=\"tableNumberRooms\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tablePorch != null : "fx:id=\"tablePorch\" was not injected: check your FXML file 'Apartments.fxml'.";
        assert tableStatus != null : "fx:id=\"tableStatus\" was not injected: check your FXML file 'Apartments.fxml'.";

    }

}
