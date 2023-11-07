package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
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
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Living_complex.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {
        HelloApplication.changeScene("/com/example/esoftcompany/viewer/Living_complex.fxml");
    }

    @FXML
    void enterOrChoiceCity(ActionEvent event) {

    }

    @FXML
    void sortComplexesTable(ActionEvent event) {

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

