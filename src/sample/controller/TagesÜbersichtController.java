package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TagesÜbersichtController {
    @FXML
    private AnchorPane TagesÜbersichtPane;
    @FXML
    private Button btnBackTagesübersicht;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "TagesÜbersicht"
     * @param event Wechsel zum GUI "Übersicht"
     * @throws IOException
     */
    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        TagesÜbersichtPane.getChildren().setAll(newPane);
    }
}
