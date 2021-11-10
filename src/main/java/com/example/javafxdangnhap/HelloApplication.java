package com.example.javafxdangnhap;

import javafx.application.Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root1 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene1 = new Scene(root1,500,280);
        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());


        stage.setScene(scene1);
        stage.setTitle("hello");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}