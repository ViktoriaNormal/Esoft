package com.example.esoftcompany.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static com.example.esoftcompany.HelloApplication.stg;

public class HousesController extends Load implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address;

    @FXML
    private ComboBox<?> comboBoxComplex;

    @FXML
    private Button creation;

    @FXML
    private Button deletion;

    @FXML
    private TableView<House> housesTable;

    @FXML
    private TableColumn<House, Integer> quantityApartmentsForSale;

    @FXML
    private TableColumn<House, Integer> quantitySoldApartments;

    @FXML
    private TableColumn<House, String> tableComplex;

    @FXML
    private TableColumn<House, String> tableHouse;

    @FXML
    private TableColumn<House, String> tableStatus;

    @FXML
    private TableColumn<House, String> tableStreet;

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
    private Button clearing;

    @FXML
    void clearFiltered(ActionEvent event) {

    }

    @FXML
    void createNewHouse(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/House.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) throws IOException {
        String titleWindow = "Редактирование дома";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/esoftcompany/viewer/House.fxml"));
        root = loader.load();
        HouseController houseController = loader.getController();
        houseController.setWindowLabel(titleWindow);

        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void enterAddress(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceComplex(ActionEvent event) {

    }

    @FXML
    void sortHousesTable(ActionEvent event) {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        changeViewer();
    }

    public void changeViewer() {
        HouseContainer houseContainer = new HouseContainer();
        ObservableList<House> houses = FXCollections.observableList(houseContainer.getHouses());
        quantityApartmentsForSale.setCellValueFactory(new PropertyValueFactory<>("counter_ready"));
        quantitySoldApartments.setCellValueFactory(new PropertyValueFactory<>("counter_sold"));
        tableComplex.setCellValueFactory(new PropertyValueFactory<>("complex_name"));
        tableHouse.setCellValueFactory(new PropertyValueFactory<>("house_number"));
        tableStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        tableStreet.setCellValueFactory(new PropertyValueFactory<>("street"));
        try {
            housesTable.setItems(houses);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}

