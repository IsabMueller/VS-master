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
     * Controller Klasse für den Punkt "EinstellungenAenderPasswort"
     * @param event Wechsel zum GUI "SicherheitsEinstellungen"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        PasswortChangePane.getChildren().setAll(newPane);
    }
    String Eingabe1;
    String Eingabe2;
    String Eingabe3;

    public TextField getTfAltesPasswort() {

        return tfAltesPasswort;
    }

    public TextField getTfNeuesPasswort() {

        return tfNeuesPasswort;
    }
    public TextField getTfPasswortWiederholen() {

        return tfPasswortWiederholen;
    }
    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submit(ActionEvent event) {
        Eingabe1 = tfAltesPasswort.getText();
        Eingabe2 = tfNeuesPasswort.getText();
        Eingabe3 = tfPasswortWiederholen.getText();
        System.out.println('\n'+ Eingabe1  +'\n'+ Eingabe2 + '\n' + Eingabe3);
    }
}