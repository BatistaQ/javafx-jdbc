package com.project.javafxjdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800,600);
            stage.setScene(scene);
            stage.setTitle("Sample JavaFX application");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}