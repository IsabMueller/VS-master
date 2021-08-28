package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfilController {
    @FXML
    private AnchorPane profilPane;
    @FXML
    private Button btnBackProfil;

    /**
     *
     * @param event Anzeigen des GUI "Start"
     * @throws IOException
     */
    public void handleBtnBackProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        profilPane.getChildren().setAll(newPane);
    }
}
