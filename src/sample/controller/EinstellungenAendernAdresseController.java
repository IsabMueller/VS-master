package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernAdresseController {
    @FXML
    private TextField tfChangedLand;
    @FXML
    private TextField tfChangedPostleitzahl;
    @FXML
    private TextField tfChangedStadt;
    @FXML
    private TextField tfChangedHausnummer;
    @FXML
    private TextField tfChangedStarße;
    @FXML
    private Button btnChangedAdress;
    @FXML
    private Pane adresseChangePane;
    @FXML
    private Button btnBackAdresseChange;

    /**
     *
     * @param event Änderung der Adresse
     * @throws IOException Anzeigen des UI Profil Einstellungen
     */
    public void handleBtnBackAdresseChange(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        adresseChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe1;
    String Eingabe2;
    String Eingabe3;
    String Eingabe4;
    String Eingabe5;

    public TextField getTfChangedLand() {

        return tfChangedLand;
    }
    public TextField getTfChangedPostleitzahl() {

        return tfChangedPostleitzahl;
    }
    public TextField getTfChangedStadt() {

        return tfChangedStadt;
    }
    public TextField getTfChangedHausnummer() {

        return tfChangedHausnummer;
    }
    public TextField getTfChangedStarße() {

        return tfChangedStarße;
    }

    public void submit(ActionEvent event) {
        Eingabe1 = tfChangedLand.getText();
        Eingabe2 = tfChangedPostleitzahl.getText();
        Eingabe3 = tfChangedStadt.getText();
        Eingabe4 = tfChangedHausnummer.getText();
        Eingabe5 = tfChangedStarße.getText();
        System.out.println('\n'+ Eingabe1  +'\n'+ Eingabe2  +'\n'+ Eingabe3  +'\n'+ Eingabe4  +'\n'+ Eingabe5);
    }
}
