package com.project.javafxjdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
            ScrollPane scrollPane = fxmlLoader.load();

            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);

            scene = new Scene(scrollPane);
            stage.setScene(scene);
            stage.setTitle("Sample JavaFX application");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Scene getScene(){
        return scene;
    }

    public static void main(String[] args) {
        launch();
    }
}