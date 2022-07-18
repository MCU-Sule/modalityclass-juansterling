package com.example.pt03_2072009.controller;

import com.example.pt03_2072009.HelloController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Tambahdiskon {
    @FXML
    private TextField jmldiskon;
    @FXML
    private Label labeldiskon;
    private float discount;

    public void adddiskon() {
        this.discount = Float.parseFloat(jmldiskon.getText());
        jmldiskon.clear();
        labeldiskon.getScene().getWindow().hide();

    }

    public float getDiscount() {
        return discount;
    }

}

