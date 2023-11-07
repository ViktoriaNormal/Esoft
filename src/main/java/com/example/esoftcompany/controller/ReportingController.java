package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReportingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label allLivingComplexes;

    @FXML
    private TableColumn<?, ?> apartmentTableNumber;

    @FXML
    private TextField areaCoefficient;

    @FXML
    private Label areaLabel;

    @FXML
    private TextField baseCoefficient;

    @FXML
    private Label baseLabel;

    @FXML
    private ComboBox<?> comboBoxComplex;

    @FXML
    private Label costsAllLivingComplexes;

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
    private Label profit;

    @FXML
    private TableView<?> reportingTable;

    @FXML
    private TextField roomsCoefficient;

    @FXML
    private Label roomsLabel;

    @FXML
    private Button savingСhanges;

    @FXML
    private Label soldApartments;

    @FXML
    private TableColumn<?, ?> tableCost;

    @FXML
    private TableColumn<?, ?> tableFloor;

    @FXML
    private TableColumn<?, ?> tableStatus;

    @FXML
    private Label unsoldApartments;

    @FXML
    void enterAreaCoefficient(ActionEvent event) {

    }

    @FXML
    void enterBaseCoefficient(ActionEvent event) {

    }

    @FXML
    void enterHouseNumber(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceComplex(ActionEvent event) {

    }

    @FXML
    void enterRoomsCoefficient(ActionEvent event) {

    }

    @FXML
    void saveСhanges(ActionEvent event) {

    }

    @FXML
    void sortReportingTable(ActionEvent event) {

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

