package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class LivingComplexesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> choiceBoxStatus;

    @FXML
    private ComboBox<?> comboBoxCity;

    @FXML
    private TableView<?> complexesTable;

    @FXML
    private Button creation;

    @FXML
    private Button deletion;

    @FXML
    private Button editing;

    @FXML
    private Button navApartments;

    @FXML
    private Button navHouses;

    @FXML
    private Button navLivingComplexes;

    @FXML
    private Button navReporting;

    @FXML
    private TableColumn<?, ?> quantityHouses;

    @FXML
    private TableColumn<?, ?> tableCity;

    @FXML
    private TableColumn<?, ?> tableComplex;

    @FXML
    private TableColumn<?, ?> tableStatus;

    @FXML
    void choiceStatus(MouseEvent event) {

    }

    @FXML
    void createNewComplex(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceCity(ActionEvent event) {

    }

    @FXML
    void sortComplexesTable(ActionEvent event) {

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
        assert choiceBoxStatus != null : "fx:id=\"choiceBoxStatus\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert comboBoxCity != null : "fx:id=\"comboBoxCity\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert complexesTable != null : "fx:id=\"complexesTable\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert creation != null : "fx:id=\"creation\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert deletion != null : "fx:id=\"deletion\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert editing != null : "fx:id=\"editing\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert navApartments != null : "fx:id=\"navApartments\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert navHouses != null : "fx:id=\"navHouses\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert navLivingComplexes != null : "fx:id=\"navLivingComplexes\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert navReporting != null : "fx:id=\"navReporting\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert quantityHouses != null : "fx:id=\"quantityHouses\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert tableCity != null : "fx:id=\"tableCity\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert tableComplex != null : "fx:id=\"tableComplex\" was not injected: check your FXML file 'Living_complexes.fxml'.";
        assert tableStatus != null : "fx:id=\"tableStatus\" was not injected: check your FXML file 'Living_complexes.fxml'.";

    }

}

