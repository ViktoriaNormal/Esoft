package com.example.esoftcompany.controller;

import java.net.URL;
import java.util.ResourceBundle;
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
        assert allLivingComplexes != null : "fx:id=\"allLivingComplexes\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert apartmentTableNumber != null : "fx:id=\"apartmentTableNumber\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert areaCoefficient != null : "fx:id=\"areaCoefficient\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert areaLabel != null : "fx:id=\"areaLabel\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert baseCoefficient != null : "fx:id=\"baseCoefficient\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert baseLabel != null : "fx:id=\"baseLabel\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert comboBoxComplex != null : "fx:id=\"comboBoxComplex\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert costsAllLivingComplexes != null : "fx:id=\"costsAllLivingComplexes\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert houseNumber != null : "fx:id=\"houseNumber\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert navApartments != null : "fx:id=\"navApartments\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert navHouses != null : "fx:id=\"navHouses\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert navLivingComplexes != null : "fx:id=\"navLivingComplexes\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert navReporting != null : "fx:id=\"navReporting\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert profit != null : "fx:id=\"profit\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert reportingTable != null : "fx:id=\"reportingTable\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert roomsCoefficient != null : "fx:id=\"roomsCoefficient\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert roomsLabel != null : "fx:id=\"roomsLabel\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert savingСhanges != null : "fx:id=\"savingСhanges\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert soldApartments != null : "fx:id=\"soldApartments\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert tableCost != null : "fx:id=\"tableCost\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert tableFloor != null : "fx:id=\"tableFloor\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert tableStatus != null : "fx:id=\"tableStatus\" was not injected: check your FXML file 'Reporting.fxml'.";
        assert unsoldApartments != null : "fx:id=\"unsoldApartments\" was not injected: check your FXML file 'Reporting.fxml'.";

    }

}

