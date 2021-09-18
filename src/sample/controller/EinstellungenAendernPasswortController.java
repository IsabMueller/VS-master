package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenAendernPasswortController {

    @FXML
    private TextField tfNeuesPasswort;
    @FXML
    private TextField tfAltesPasswort;
    @FXML
    private TextField tfPasswortWiederholen;
    @FXML
    private AnchorPane PasswortChangePane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnChangedPasswort;

    /**
     * Methode von Zuweisung eines Buttons
     * @param event Änderung des Passwortes
     * @throws IOException Anzeigen des GUI "SicherheitsEinstellungen"
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        PasswortChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe1;
    String Eingabe2;
    String Eingabe3;

    //Methode zur Änderung des alten Passwortes
    public TextField getTfAltesPasswort() {

        return tfAltesPasswort;
    }

    //Methode zur Änderung des neuen Passworts
    public TextField getTfNeuesPasswort() {

        return tfNeuesPasswort;
    }
    //Methode für das Wiederholen des Passwortes
    public TextField getTfPasswortWiederholen() {

        return tfPasswortWiederholen;
    }
    // Methode zur Ausgabe des Eingegebene Textfeldes
    public void submit(ActionEvent event) {
        Eingabe1 = tfAltesPasswort.getText();
        Eingabe2 = tfNeuesPasswort.getText();
        Eingabe3 = tfPasswortWiederholen.getText();
        System.out.println('\n'+ Eingabe1  +'\n'+ Eingabe2 + '\n' + Eingabe3);
    }
}