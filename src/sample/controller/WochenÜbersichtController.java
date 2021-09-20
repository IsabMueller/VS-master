package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WochenÜbersichtController {
    @FXML
    private AnchorPane WochenÜbersichtPane;
    @FXML
    private Button btnBackTagesübersicht;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller zum Anzeigen der Wochenübersicht
     * @param event
     * @throws IOException
     */
    //< Methode der Rückkehr eines ÜbersichtTages
    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        WochenÜbersichtPane.getChildren().setAll(newPane);
    }
}
