package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LivingComplexController {

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
    private TextField city;

    @FXML
    private TableView<?> complexTable;

    @FXML
    private TextField constructionCosts;

    @FXML
    private TableColumn<?, ?> houseNumber;

    @FXML
    private TextField livingComplex;

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
    private ChoiceBox<?> status;

    @FXML
    private TableColumn<?, ?> street;

    @FXML
    private Label windowTitle;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void comeBack(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Living_complexes.fxml");
    }

    @FXML
    void enterAddedValueConstruction(ActionEvent event) {

    }

    @FXML
    void enterCity(ActionEvent event) {

    }

    @FXML
    void enterConstructionCosts(ActionEvent event) {

    }

    @FXML
    void enterLivingComplex(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void sortComplexTable(ActionEvent event) {

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

