package com.example.pt03_2072009.controller;

import com.example.pt03_2072009.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class Tambahmenu {
    @FXML
    private ComboBox<String> pildiskon;
    @FXML
    private ObservableList<String> listdiskon;
    @FXML
    private TextField namamenu;
    @FXML
    private TextField hargamenu;
    @FXML
    private Label labelnamabaru;
    @FXML
    private Button customdiskon;
    private String namaBaru;
    private float hargaBaru;
    private float diskonBaru;
    private FXMLLoader fxmlLoader;
    private Stage newStage;

    public void initialize() throws IOException {
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tambahdiskon.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 532, 193);
        newStage = new Stage();
        newStage.setTitle("Custom Discount");
        newStage.setScene(scene);
        newStage.initModality(Modality.APPLICATION_MODAL);
        listdiskon = FXCollections.observableArrayList(
                "0.0",
                "0.1",
                "0.2",
                "0.3",
                "0.4",
                "0.5",
                "0.6",
                "0.7",
                "0.8",
                "0.9");
        pildiskon.setItems(listdiskon);
        pildiskon.getSelectionModel().select(0);
    }

    public String getNamaBaru() {
        return namaBaru;
    }


    public float getHargaBaru() {
        return hargaBaru;
    }

    public float getDiskonBaru() {
        return diskonBaru;
    }
    public void addmenu(ActionEvent actionEvent) throws IOException {
        this.namaBaru = namamenu.getText();
        this.hargaBaru = Float.parseFloat(hargamenu.getText());
        if (customdiskon.getText().equals("Custom Discount")) {
            this.diskonBaru= Float.parseFloat(pildiskon.getValue());
        } else {
            this.diskonBaru = Float.parseFloat(customdiskon.getText());
        }
        namamenu.clear();
        hargamenu.clear();
        customdiskon.setText("Custom Discount");
        pildiskon.getSelectionModel().select(0);
        labelnamabaru.getScene().getWindow().hide();
    }
    public void customdiskon(ActionEvent actionEvent) throws IOException {
        newStage.showAndWait();
        Tambahdiskon discountController = fxmlLoader.getController();
        customdiskon.setText(String.valueOf(discountController.getDiscount()/100));
    }

}
