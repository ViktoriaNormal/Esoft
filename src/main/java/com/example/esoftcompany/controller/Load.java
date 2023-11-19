package com.example.esoftcompany.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.esoftcompany.HelloApplication.stg;

public abstract class Load {

    protected Scene scene;
    protected Parent root;

    @FXML
    public void loadScene(ActionEvent event, String filePath) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(filePath));
        root = loader.load();

        stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
}
