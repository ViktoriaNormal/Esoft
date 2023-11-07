package com.example.esoftcompany;

import com.example.esoftcompany.util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        primaryStage.setResizable(false);
        primaryStage.setTitle("Esoft Application");
        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("/com/example/esoftcompany/viewer/Living_complexes.fxml")))));
        primaryStage.show();
    }

    public static Object changeScene(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxml));
            Parent pane = loader.load();
            stg.setScene(new Scene(pane));
            return loader.getController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        HibernateUtil hibernateUtil = new HibernateUtil();

        launch();
    }
}