package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenController {
    @FXML
    private Button btnKategorienVerwalten;
    @FXML
    private AnchorPane einstellungenPane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnProfileinstellungen;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnSicherheitseinstellungen;

    /**
     * Controller Klasse für den Punkt "Einstellungen"
     * @param event Wechsel zum GUI "Start"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Controller Klasse für den Punkt "Einstellungen"
     * @param event Wechsel zum GUI "Profileinstellungen"
     * @throws IOException
     */
    public void handleBtnProfilEinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Controller Klasse für den Punkt "Einstellungen"
     * @param event Wechsel zum GUI "KategorienVerwaltung"
     * @throws IOException
     */
    public void handleBtnKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/KategorienVerwalten.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Controller Klasse für den Punkt "Einstellungen"
     * @param event Wechsel zum GUI "Sicherheitseinstellungen"
     * @throws IOException
     */
    public void handleBtnSicherheitseinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        einstellungenPane.getChildren().setAll(newPane);
    }
}
