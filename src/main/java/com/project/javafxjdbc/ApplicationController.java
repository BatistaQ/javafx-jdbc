package com.project.javafxjdbc;

import com.project.javafxjdbc.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    public void onMenuItemAboutAction(){
        loadView("/com/project/javafxjdbc/About.fxml");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private synchronized void loadView(String absoluteName){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene scene = Application.getScene();
            VBox applicationVBox = (VBox) ((ScrollPane) scene.getRoot()).getContent();

            Node applicationMenu = applicationVBox.getChildren().get(0);
            applicationVBox.getChildren().clear();
            applicationVBox.getChildren().add(applicationMenu);
            applicationVBox.getChildren().addAll(newVBox.getChildren());
        } catch (IOException e){
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }

    }
}