package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;
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
        assert addedValueConstruction != null : "fx:id=\"addedValueConstruction\" was not injected: check your FXML file 'House.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'House.fxml'.";
        assert cancellation != null : "fx:id=\"cancellation\" was not injected: check your FXML file 'House.fxml'.";
        assert choiceLivingComplex != null : "fx:id=\"choiceLivingComplex\" was not injected: check your FXML file 'House.fxml'.";
        assert constructionCosts != null : "fx:id=\"constructionCosts\" was not injected: check your FXML file 'House.fxml'.";
        assert houseNumber != null : "fx:id=\"houseNumber\" was not injected: check your FXML file 'House.fxml'.";
        assert navApartments != null : "fx:id=\"navApartments\" was not injected: check your FXML file 'House.fxml'.";
        assert navHouses != null : "fx:id=\"navHouses\" was not injected: check your FXML file 'House.fxml'.";
        assert navLivingComplexes != null : "fx:id=\"navLivingComplexes\" was not injected: check your FXML file 'House.fxml'.";
        assert navReporting != null : "fx:id=\"navReporting\" was not injected: check your FXML file 'House.fxml'.";
        assert saving != null : "fx:id=\"saving\" was not injected: check your FXML file 'House.fxml'.";
        assert street != null : "fx:id=\"street\" was not injected: check your FXML file 'House.fxml'.";
        assert windowTitle != null : "fx:id=\"windowTitle\" was not injected: check your FXML file 'House.fxml'.";

    }

}
