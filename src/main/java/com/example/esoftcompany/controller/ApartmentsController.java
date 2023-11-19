package com.example.esoftcompany.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.esoftcompany.container.ApartmentContainer;
import com.example.esoftcompany.model.Apartment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static com.example.esoftcompany.HelloApplication.stg;

public class ApartmentsController extends Load implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button begining;

    @FXML
    private ComboBox<?> comboBoxComplex;

    @FXML
    private ComboBox<?> comboBoxHouse;

    @FXML
    private Button creation;

    @FXML
    private Button deletion;

    @FXML
    private Button editing;

    @FXML
    private Button end;

    @FXML
    private ComboBox<?> floor;

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
    private TableView<Apartment> apartmentsTable;

    @FXML
    private TableColumn<Apartment, String> tableAddress;

    @FXML
    private TableColumn<Apartment, Integer> tableArea;

    @FXML
    private TableColumn<Apartment, String> tableComplex;

    @FXML
    private TableColumn<Apartment, Integer> tableFloor;

    @FXML
    private TableColumn<Apartment, Integer> tableNumberRooms;

    @FXML
    private TableColumn<Apartment, Integer> tablePorch;

    @FXML
    private TableColumn<Apartment, Integer> tableStatus;

    @FXML
    private Pagination pagination;

    @FXML
    private ComboBox<?> porch;

    @FXML
    private ChoiceBox<?> status;

    @FXML
    void savingFiltering(ActionEvent event) {

    }

    @FXML
    void createNewApartment(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Apartment.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) throws IOException {
        String titleWindow = "Редактирование квартиры";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/esoftcompany/viewer/Apartment.fxml"));
        root = loader.load();
        ApartmentController apartmentController = loader.getController();
        apartmentController.setWindowLabel(titleWindow);

        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void enterOrChoiceComplex(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceFloor(ActionEvent event) {

    }

    @FXML
    void enterOrChoiceHouse(ActionEvent event) {

    }

    @FXML
    void enterOrChoicePorch(ActionEvent event) {

    }

    @FXML
    void sortApartmentsTable(ActionEvent event) {

    }

    @FXML
    void toBegining(ActionEvent event) {

    }

    @FXML
    void toEnd(ActionEvent event) {

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
        ApartmentContainer apartmentContainer = new ApartmentContainer();
        ObservableList<Apartment> apartments = FXCollections.observableList(apartmentContainer.getApartments());
        tableAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tableArea.setCellValueFactory(new PropertyValueFactory<>("area"));
        tableComplex.setCellValueFactory(new PropertyValueFactory<>("complex"));
        tableFloor.setCellValueFactory(new PropertyValueFactory<>("floor"));
        tableNumberRooms.setCellValueFactory(new PropertyValueFactory<>("number_rooms"));
        tablePorch.setCellValueFactory(new PropertyValueFactory<>("porch"));
        tableStatus.setCellValueFactory(new PropertyValueFactory<>("apartment_status"));
        try {
            apartmentsTable.setItems(apartments);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
