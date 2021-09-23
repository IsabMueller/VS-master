package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;


public class ErrorController {
    @FXML
    private Button btnErrorOk;
    @FXML
    private AnchorPane paneError;

    public void handleBtnErrorOK(ActionEvent event) throws IOException {
        AnchorPane newPane;
        newPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Login.fxml")));
        paneError.getChildren().setAll(newPane);
    }

}



/**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Error"
     * @param event Wechsel zum GUI "Login"
     * @throws IOException
     */
