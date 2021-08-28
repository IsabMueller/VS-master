package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SicherheitsEinstellungenController {
    @FXML
    private Button btnChangePasswort;
    @FXML
    private Button btnChangeEmail;
    @FXML
    private Button btnBackSicherheitseinstellungen;
    @FXML
    private AnchorPane SicherheitseinstellungenPane;


    /**
     * Controller für den Abschnitt Einstellungen
     * @param event Anzeigen der GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnBackSicherheitseinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../../view/Einstellungen.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Controller für den Abschnitt Änderung der Mail-Adresse
     * @param event Anzeigen der GUI "EinstellungenAendernEmail"
     * @throws IOException
     */
    public void handleBtnChangeEmail(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernEmail.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Controller für den Abschnitt Änderung des Passworts
     * @param event
     * @throws IOException
     */
    public void handleBtnChangePasswort(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernPasswort.fxml"));
        SicherheitseinstellungenPane.getChildren().setAll(newPane);
    }
}
