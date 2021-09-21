package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class ErrorController {
    @FXML
    private AnchorPane paneError;
    @FXML
    private Button btnErrorOk;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Error"
     * @param event Wechsel zum GUI "Login"
     * @throws IOException
     */
    public void handleBtnErrorOK(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        paneError.getChildren().setAll(newPane);
    }
}
