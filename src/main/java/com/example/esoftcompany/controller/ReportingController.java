package com.example.esoftcompany.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.HelloApplication;
import com.example.esoftcompany.container.ApartmentContainer;
import com.example.esoftcompany.container.HouseContainer;
import com.example.esoftcompany.model.Apartment;
import com.example.esoftcompany.model.House;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static com.example.esoftcompany.HelloApplication.stg;

public class ReportingController extends Load implements Initializable {

    private int area_Coefficient;

    private int rooms_Coefficient;

    private int base_Coefficient;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label allLivingComplexes;

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
    private TextField roomsCoefficient;

    @FXML
    private Label roomsLabel;

    @FXML
    private Button savingСhanges;

    @FXML
    private Label soldApartments;

    @FXML
    private Label unsoldApartments;

    @FXML
    private Button saving;

    @FXML
    void savingFiltering(ActionEvent event) {

    }

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
    void saveСhanges(ActionEvent event) throws IOException {
        area_Coefficient = Integer.parseInt(areaCoefficient.getText());
        rooms_Coefficient = Integer.parseInt(roomsCoefficient.getText());
        base_Coefficient = Integer.parseInt(baseCoefficient.getText());
        changeViewer();
    }

    @FXML
    void sortReportingTable(ActionEvent event) {

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
    public void loadScene(ActionEvent event, String filePath) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(filePath));
        root = loader.load();

        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void initialize() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        changeViewer();
    }

    @FXML
    private TableView<Apartment> reportingTable;

    @FXML
    private TableColumn<Apartment, Integer> tableCost;

    @FXML
    private TableColumn<Apartment, Integer> tableFloor;

    @FXML
    private TableColumn<Apartment, String> tableStatus;

    @FXML
    private TableColumn<Apartment, Integer> apartmentTableNumber;

    public int cost_formula(Apartment apartment) {
        return apartment.getArea() * area_Coefficient
                + apartment.getNumber_rooms() * rooms_Coefficient
                + base_Coefficient + apartment.getAdditional_cost_finishing() +
                apartment.getHouse().getHouse_added_value_construction() +
                apartment.getHouse().getComplex().getComplex_added_value_construction();
    }
    public void changeViewer() {
        ApartmentContainer apartmentContainer = new ApartmentContainer();
        ObservableList<Apartment> apartments = FXCollections.observableList(apartmentContainer.getApartments());
        for (Apartment apartment : apartments) {
            apartment.setCost(cost_formula(apartment));
        }
        tableCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        tableFloor.setCellValueFactory(new PropertyValueFactory<>("floor"));
        tableStatus.setCellValueFactory(new PropertyValueFactory<>("apartment_status"));
        apartmentTableNumber.setCellValueFactory(new PropertyValueFactory<>("apartment_number"));
        try {
            reportingTable.setItems(apartments);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}

