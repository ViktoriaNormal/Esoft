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


//package com.example.esoftcompany.controller;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//import com.example.esoftcompany.container.LivingComplexContainer;
//import com.example.esoftcompany.dao.LivingComplexDao;
//import com.example.esoftcompany.model.LivingComplex;
//import javafx.beans.binding.Bindings;
//import javafx.beans.property.ObjectProperty;
//import javafx.beans.property.SimpleObjectProperty;
//import javafx.beans.value.ObservableValue;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.collections.transformation.FilteredList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ChoiceBox;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//import static com.example.esoftcompany.HelloApplication.stg;
//
//public class LivingComplexesController extends Load implements Initializable {
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private TableView<LivingComplex> complexesTable;
//
//    @FXML
//    private Button creation;
//
//    @FXML
//    private Button deletion;
//
//    @FXML
//    private Button editing;
//
//    @FXML
//    private Button navApartments;
//
//    @FXML
//    private Button navHouses;
//
//    @FXML
//    private Button navLivingComplexes;
//
//    @FXML
//    private Button navReporting;
//
//    @FXML
//    private Button clearing;
//
//    @FXML
//    private ChoiceBox<String> choiceBoxStatus;
//
//    private final String[] statuses = {"Планируемые", "Строящиеся", "Построенные"};
//
//    @FXML
//    void choiceStatus(MouseEvent event) {
//
//    }
//
//    @FXML
//    private ComboBox<String> comboBoxCity;
//
//    @FXML
//    void enterOrChoiceCity(ActionEvent event) {
//
//    }
//
//    @FXML
//    void clearFiltered(ActionEvent event) {
//        clearing.setOnAction(e -> {
//            choiceBoxStatus.setValue(null);
//            comboBoxCity.setValue(null);
//        });
//    }
//
//    @FXML
//    void createNewComplex(ActionEvent event) throws IOException {
//        loadScene(event, "/com/example/esoftcompany/viewer/Living_complex.fxml");
//    }
//
//    @FXML
//    void delete(ActionEvent event) {
//
//    }
//
//    @FXML
//    void edit(ActionEvent event) throws IOException {
//        String titleWindow = "Редактирование ЖК";
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/esoftcompany/viewer/Living_complex.fxml"));
//        root = loader.load();
//        LivingComplexController livingComplexController = loader.getController();
//        livingComplexController.setWindowLabel(titleWindow);
//
//        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stg.setScene(scene);
//        stg.show();
//    }
//
//    @FXML
//    void sortComplexesTable(ActionEvent event) {
//
//    }
//
//    @FXML
//    void toApartments(ActionEvent event) throws IOException {
//        loadScene(event, "/com/example/esoftcompany/viewer/Apartments.fxml");
//    }
//
//    @FXML
//    void toHouses(ActionEvent event) throws IOException {
//        loadScene(event, "/com/example/esoftcompany/viewer/Houses.fxml");
//    }
//
//    @FXML
//    void toLivingComplexes(ActionEvent event) throws IOException {
//        loadScene(event, "/com/example/esoftcompany/viewer/Living_complexes.fxml");
//    }
//
//    @FXML
//    void toReporting(ActionEvent event) throws IOException {
//        loadScene(event, "/com/example/esoftcompany/viewer/Reporting.fxml");
//    }
//
//    @FXML
//    void initialize() {
//
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        changeViewer();
//
//        choiceBoxStatus.getItems().addAll(statuses);
//
//        LivingComplexDao livingComplexDao = new LivingComplexDao();
//        String[] distinctCity = livingComplexDao.getCityComplexes().toArray(new String[0]);
//        comboBoxCity.getItems().addAll(distinctCity);
//    }
//
////    public void changeViewer() {
////        LivingComplexContainer livingComplexContainer = new LivingComplexContainer();
////        ObservableList<LivingComplex> livingComplexes = FXCollections.observableList(livingComplexContainer.getComplexes());
////        quantityHouses.setCellValueFactory(new PropertyValueFactory<>("counter"));
////        tableCity.setCellValueFactory(new PropertyValueFactory<>("complex_city"));
////        tableComplex.setCellValueFactory(new PropertyValueFactory<>("complex_name"));
////        tableStatus.setCellValueFactory(new PropertyValueFactory<>("complex_status"));
////        try {
////            complexesTable.setItems(livingComplexes);
////        } catch (Exception e) {
////            throw new RuntimeException();
////        }
////    }
//
//    public void changeViewer() {
//        complexesTable = new TableView<>();
//        complexesTable.getColumns().add(column("Название ЖК", LivingComplex::complex_nameProperty));
//        complexesTable.getColumns().add(column("Статус", LivingComplex::complex_statusProperty));
//        complexesTable.getColumns().add(column("Кол-во домов", LivingComplex::getCounterProperty));
//        complexesTable.getColumns().add(column("Город", LivingComplex::complex_cityProperty));
//
//        ObjectProperty<Predicate<LivingComplex>> statusFilter = new SimpleObjectProperty<>();
//        ObjectProperty<Predicate<LivingComplex>> cityFilter = new SimpleObjectProperty<>();
//
//        cityFilter.bind(Bindings.createObjectBinding(() -> livingComplex -> comboBoxCity.getValue() == null
//                || comboBoxCity.getValue().equals(livingComplex.getComplex_city()), comboBoxCity.valueProperty()));
//
//        statusFilter.bind(Bindings.createObjectBinding(() -> livingComplex -> choiceBoxStatus.getValue() == null
//                || choiceBoxStatus.getValue().equals(livingComplex.getComplex_status()), choiceBoxStatus.valueProperty()));
//
//        LivingComplexContainer livingComplexContainer = new LivingComplexContainer();
//
//        FilteredList<LivingComplex> filteredItems = new FilteredList<>(FXCollections.observableList(livingComplexContainer.getComplexes()));
//        complexesTable.setItems(filteredItems);
//
//        filteredItems.predicateProperty().bind(Bindings.createObjectBinding(
//                () -> statusFilter.get().and(cityFilter.get()),
//                statusFilter, cityFilter));
//
//    }
//
//    //    @FXML
////    private TableColumn<LivingComplex, Integer> quantityHouses;
////
////    @FXML
////    private TableColumn<LivingComplex, String> tableCity;
////
////    @FXML
////    private TableColumn<LivingComplex, String> tableComplex;
////
////    @FXML
////    private TableColumn<LivingComplex, String> tableStatus;
//
//    private static <S,T> TableColumn<S,T> column(String title, Function<S, ObservableValue<T>> property) {
//        TableColumn<S,T> col = new TableColumn<>(title);
//        col.setCellValueFactory(cellData -> property.apply(cellData.getValue()));
//        return col ;
//    }
//
//    public Scene getScene() {
//        return scene;
//    }
//
//    public void setScene(Scene scene) {
//        this.scene = scene;
//    }
//}

