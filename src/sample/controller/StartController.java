package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartController {

    @FXML
    private AnchorPane TerminTabelle;
    @FXML
    private Button btnTerminEdit;
    @FXML
    private Button btnTerminLoeschen;
    @FXML
    private Button btnDetailsTagesübersicht;
    @FXML
    private Button btnTracker;
    @FXML
    private Button btnLogout;
    @FXML
    private Button btnProfil;
    @FXML
    private Button btnUebersicht;
    @FXML
    private Button btnEinstellungen;
    @FXML
    private Button btnAdressbuch;
    @FXML
    private AnchorPane startPane;
    @FXML
    private Button btnTerminNew;

    /**
     * Aufrufen des GUI zur Änderung von Terminen
     * @param event Neuer Termin, Terminänderung (Beartbeitung oder Löschung), Übersicht, Adressbuch, Tagesübersicht
     *              und Tracker
     * @throws IOException
     */
    public void handleBtnTerminNew(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TerminNeu.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Profil.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnAdressbuch(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Adressbuch.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnEinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnTerminEdit(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TerminBearbeiten.fxml"));
        startPane.getChildren().setAll(newPane);
    }

    public void handleBtnDetailTagesÜersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TagesÜbersicht.fxml"));
        TerminTabelle.getChildren().setAll(newPane);
    }

    public void handleBtnTracker(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Tracker.fxml"));
        startPane.getChildren().setAll(newPane);
    }
}


