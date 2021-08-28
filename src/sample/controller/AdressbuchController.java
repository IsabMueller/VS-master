package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

//erstmal ignorieren

public class AdressbuchController {
    @FXML
    private AnchorPane neuerKalenderPane;
    @FXML
    private Button btnBackNeuerKalender;

    /**
     * Methode zum Erstellen eines neuen Kalenders nach Registirerung.
     */

    public void handleBtnNeuerKalender(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        neuerKalenderPane.getChildren().setAll(newPane);
    }
}

