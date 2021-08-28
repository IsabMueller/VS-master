package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class WillkommenController {
    @FXML
    private Button btnReg;
    @FXML
    private Button btnLogIn;
    @FXML
    private AnchorPane welcomePane;


    /**
     * Aufruf des GUI "Willkommen" (Post LogIn Screen)
     * @param actionEvent
     */
    public void handleBtnReg(ActionEvent actionEvent) {
        BorderPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("../view/Register.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        welcomePane.getChildren().setAll(newPane);
    }

    // aufrufen der Login.fxml//
    public void handleBtnLogIn(ActionEvent actionEvent) {
        BorderPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        welcomePane.getChildren().setAll(newPane);
    }
}
