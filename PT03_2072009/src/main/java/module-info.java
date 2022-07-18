module com.example.pt03_2072009 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pt03_2072009 to javafx.fxml;
    exports com.example.pt03_2072009;

    opens com.example.pt03_2072009.model to javafx.fxml;
    exports com.example.pt03_2072009.model;

    opens com.example.pt03_2072009.controller to javafx.fxml;
    exports com.example.pt03_2072009.controller;
}