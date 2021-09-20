package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfilEinstellungenController {


    @FXML
    private Button btnChangeAdresse;
    @FXML
    private Button btnChangeNachname;
    @FXML
    private Button btnChangeVorname;
    @FXML
    private Button btnChangeUsername;
    @FXML
    private Button btnChangeGeburtstag;
    @FXML
    private TextField tfUsernameSet;
    @FXML
    private Button btnBackProfileinstellungen;
    @FXML
    private AnchorPane ProfileinstellungenPane;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnBackProfileinstellungen(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "EinstellungAendernAdresse"
     * @throws IOException
     */
    public void handleBtnChangeAdresse(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernAdresse.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "EinstellungAendernUsername"
     * @throws IOException
     */
    public void handleBtnChangeUsername(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernUsername.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "EinstellungAendernNachname"
     * @throws IOException
     */
    public void handleBtnChangeNachname(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernNachname.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "EinstellungAendernVorname"
     * @throws IOException
     */
    public void handleBtnChangeVorname(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernVorname.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "ProfilEinstellungen"
     * @param event Wechsel zum GUI "EinstellungAendernGeburtstag"
     * @throws IOException
     */
    public void handleBtnChangeGeburtstag(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/EinstellungenAendernGeburtstag.fxml"));
        ProfileinstellungenPane.getChildren().setAll(newPane);
    }
}
