package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HouseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addedValueConstruction;

    @FXML
    private Button back;

    @FXML
    private Button cancellation;

    @FXML
    private ChoiceBox<?> choiceLivingComplex;

    @FXML
    private TextField constructionCosts;

    @FXML
    private TextField houseNumber;

    @FXML
    private Button navApartments;

    @FXML
    private Button navHouses;

    @FXML
    private Button navLivingComplexes;

    @FXML
    private Button navReporting;

    @FXML
    private Button saving;

    @FXML
    private TextField street;

    @FXML
    private Label windowTitle;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void comeBack(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Houses.fxml");
    }

    @FXML
    void enterAddedValueConstruction(ActionEvent event) {

    }

    @FXML
    void enterConstructionCosts(ActionEvent event) {

    }

    @FXML
    void enterHouseNumber(ActionEvent event) {

    }

    @FXML
    void enterStreet(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

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
