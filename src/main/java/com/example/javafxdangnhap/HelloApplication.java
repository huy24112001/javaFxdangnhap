package com.example.javafxdangnhap;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {

        GridPane root = new GridPane();

        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);

        Label labelTitle = new Label("Enter your user name and password!");


        // Đặt vào ô lưới (0, 0) , bắc qua 2 cột, 1 dòng.
        root.add(labelTitle, 0, 0, 2, 1);

        Label labelUserName = new Label("User Name");
        TextField fieldUserName = new TextField();

        Label labelPassword = new Label("Password");

        PasswordField fieldPassword = new PasswordField();

        Button loginButton = new Button("Login");

        GridPane.setHalignment(labelUserName, HPos.RIGHT);


        // Đặt vào ô lưới (0,1)
        root.add(labelUserName, 0, 1);


        GridPane.setHalignment(labelPassword, HPos.RIGHT);
        root.add(labelPassword, 0, 2);

        // Căn lề trái cho User Name
        GridPane.setHalignment(fieldUserName, HPos.LEFT);
        root.add(fieldUserName, 1, 1);


        // Căn lề trái cho trường Password
        GridPane.setHalignment(fieldPassword, HPos.LEFT);
        root.add(fieldPassword, 1, 2);


        // Căn lề phải cho button Login.
        GridPane.setHalignment(loginButton, HPos.RIGHT);
        root.add(loginButton, 1, 3);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}