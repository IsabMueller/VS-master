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
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "TerminNeu"
     * @throws IOException
     */
    public void handleBtnTerminNew(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TerminNeu.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Profil"
     * @throws IOException
     */
    public void handleBtnProfil(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Profil.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Übersicht"
     * @throws IOException
     */
    public void handleBtnUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Uebersicht.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Adressbuch"
     * @throws IOException
     */
    public void handleBtnAdressbuch(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Adressbuch.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnEinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "TerminBearbeiten"
     * @throws IOException
     */
    public void handleBtnTerminEdit(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TerminBearbeiten.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Tagesübersicht"
     * @throws IOException
     */
    public void handleBtnDetailTagesÜersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TagesÜbersicht.fxml"));
        startPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "TerminNeu"
     * @throws IOException
     */
    public void handleBtnTracker(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Tracker.fxml"));
        startPane.getChildren().setAll(newPane);
    }
}


