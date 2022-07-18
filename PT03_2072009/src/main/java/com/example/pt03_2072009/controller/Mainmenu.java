package com.example.pt03_2072009.controller;
import com.example.pt03_2072009.HelloApplication;
import com.example.pt03_2072009.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
public class Mainmenu {
    @FXML
    private ObservableList<Item> menu;
    @FXML
    private ListView list;
    private Stage stage;
    private FXMLLoader fxmlLoader;

    public void initialize() throws IOException {
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tambahmenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 405, 251);
        stage = new Stage();
        stage.setTitle("Add Menu");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        menu = FXCollections.observableArrayList(
                new Item("C", 4000, 0),
                new Item("l", 5000, 0),
                new Item("o", 5000, 0),
                new Item("a", 2500, 0)
        );
        list.setItems(menu);
    }

    public void gotomymenu(){
        stage.showAndWait();
        Tambahmenu addController = fxmlLoader.getController();
        menu.add(new Item(addController.getNamaBaru(),addController.getHargaBaru(), addController.getDiskonBaru()));
    }
}
