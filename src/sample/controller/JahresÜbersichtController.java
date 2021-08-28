package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class JahresÜbersichtController {
    @FXML
    private Button btnBackTagesübersicht;
    @FXML
    private AnchorPane JahresÜbersichtPane;

    /**
     *
     * @param event Wechsel zum GUI "Uebersicht" (Tagesübersicht)
     * @throws IOException Rückkehr zum vorhergehenden GUI
     */
    public void handleBtnBackÜbersichtTag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        JahresÜbersichtPane.getChildren().setAll(newPane);
    }
}
