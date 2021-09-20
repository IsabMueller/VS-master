package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UebersichtController {

    @FXML
    private Button btnTagesübersicht;
    @FXML
    private Button btnMonatsübersicht;
    @FXML
    private Button btnWochenübersicht;
    @FXML
    private Button btnJahresübersicht;
    @FXML
    private AnchorPane uebersichtPane;
    @FXML
    private Button btnBackUebersicht;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Übersicht"
     * @param event Wechsel zum GUI "Start"
     * @throws IOException
     */
    public void handleBtnBackUebersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Übersicht"
     * @param event Wechsel zum GUI "Tagesübersicht"
     * @throws IOException
     */
    public void handleBtnTagesübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/TagesÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Übersicht"
     * @param event Wechsel zum GUI "WochenÜbersicht"
     * @throws IOException
     */
    public void handleBtnWochenübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/WochenÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Übersicht"
     * @param event Wechsel zum GUI "Monatsübersicht"
     * @throws IOException
     */
    public void handleBtnMonatsübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/MonatsÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Übersicht"
     * @param event Wechsel zum GUI "Jahresübersicht"
     * @throws IOException
     */
    public void handleBtnJahresübersicht(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/JahresÜbersicht.fxml"));
        uebersichtPane.getChildren().setAll(newPane);
    }
}
