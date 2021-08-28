package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MonatsÜbersichtController {
    @FXML
    private Button btnBackTagesübersicht;
    @FXML
    private AnchorPane MonatsÜbersichtPane;

    /**
     *
     * @param event Button zum Anzeigen der Tagesübersicht (sprich: GUI "Uebersicht")
     * @throws IOException Rückkehr zum ursprünglichen GUI
     */
    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        MonatsÜbersichtPane.getChildren().setAll(newPane);
    }
}
