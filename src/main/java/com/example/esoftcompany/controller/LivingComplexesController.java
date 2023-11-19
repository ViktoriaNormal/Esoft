package com.example.esoftcompany.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.esoftcompany.container.LivingComplexContainer;
import com.example.esoftcompany.model.LivingComplex;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static com.example.esoftcompany.HelloApplication.stg;

public class LivingComplexesController extends Load implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> comboBoxCity;

    @FXML
    private TableView<LivingComplex> complexesTable;

    @FXML
    private TableColumn<LivingComplex, Integer> quantityHouses;

    @FXML
    private TableColumn<LivingComplex, String> tableCity;

    @FXML
    private TableColumn<LivingComplex, String> tableComplex;

    @FXML
    private TableColumn<LivingComplex, String> tableStatus;

    @FXML
    private Button saving;

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
    private ChoiceBox<String> choiceBoxStatus;

    private final String[] statuses = {"Планируемые", "Строящиеся", "Построенные"};
    @FXML
    void choiceStatus(MouseEvent event) {
        String filtered_status = choiceBoxStatus.getValue();

    }

    @FXML
    void savingFiltering(ActionEvent event) {

    }

    @FXML
    void createNewComplex(ActionEvent event) throws IOException {
        loadScene(event, "/com/example/esoftcompany/viewer/Living_complex.fxml");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) throws IOException {
        String titleWindow = "Редактирование ЖК";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/esoftcompany/viewer/Living_complex.fxml"));
        root = loader.load();
        LivingComplexController livingComplexController = loader.getController();
        livingComplexController.setWindowLabel(titleWindow);

        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void enterOrChoiceCity(ActionEvent event) {

    }

    @FXML
    void sortComplexesTable(ActionEvent event) {

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
        choiceBoxStatus.getItems().addAll(statuses);
        choiceBoxStatus.setOnMousePressed(this::choiceStatus);
    }

    public void changeViewer() {
        LivingComplexContainer livingComplexContainer = new LivingComplexContainer();
        ObservableList<LivingComplex> livingComplexes = FXCollections.observableList(livingComplexContainer.getComplexes());
        quantityHouses.setCellValueFactory(new PropertyValueFactory<>("counter"));
        tableCity.setCellValueFactory(new PropertyValueFactory<>("complex_city"));
        tableComplex.setCellValueFactory(new PropertyValueFactory<>("complex_name"));
        tableStatus.setCellValueFactory(new PropertyValueFactory<>("complex_status"));
        try {
            complexesTable.setItems(livingComplexes);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}

