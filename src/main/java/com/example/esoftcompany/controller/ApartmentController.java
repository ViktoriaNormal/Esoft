package com.example.esoftcompany.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApartmentController extends Load{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField additionalCostFinishing;

    @FXML
    private TextField apartmentArea;

    @FXML
    private TextField apartmentNumber;

    @FXML
    private Button back;

    @FXML
    private Button cancellation;

    @FXML
    private ChoiceBox<?> choiceHouse;

    @FXML
    private ChoiceBox<?> choiceLivingComplex;

    @FXML
    private TextField companyCostsFinishing;

    @FXML
    private TextField floor;

    @FXML
    private Button navApartments;

    @FXML
    private Button navHouses;

    @FXML
    private Button navLivingComplexes;

    @FXML
    private Button navReporting;

    @FXML
    private TextField numberOfRooms;

    @FXML
    private TextField porch;

    @FXML
    private Button saving;

    @FXML
    private ChoiceBox<?> status;

    @FXML
    private Label windowTitle;

    public void setWindowLabel(String text) {
        windowTitle.setText(text);
    }

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void comeBack(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Apartments.fxml");
    }

    @FXML
    void enterAdditionalCostFinishing(ActionEvent event) {

    }

    @FXML
    void enterApartmentArea(ActionEvent event) {

    }

    @FXML
    void enterArapartmentNumber(ActionEvent event) {

    }

    @FXML
    void enterCompanyCostsFinishing(ActionEvent event) {

    }

    @FXML
    void enterFloor(ActionEvent event) {

    }

    @FXML
    void enterPorch(ActionEvent event) {

    }

    @FXML
    void enterQuantity(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void toApartments(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Apartments.fxml");
    }

    @FXML
    void toHouses(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Houses.fxml");
    }

    @FXML
    void toLivingComplexes(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Living_complexes.fxml");
    }

    @FXML
    void toReporting(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Reporting.fxml");
    }

    @FXML
    void initialize() {

    }

}

