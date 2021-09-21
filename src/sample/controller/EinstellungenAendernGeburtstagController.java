package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernGeburtstagController {
    @FXML
    private Button btnChangedGeburtstag;
    @FXML
    private TextField tfChangedGeburtstag;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane GeburtstagChangePane;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "EinstellungenAendernGeburtstag"
     * @param event Wechsel zum GUI "ProfilEinstellungen"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
       GeburtstagChangePane.getChildren().setAll(newPane);
    }
    String Eingabe;

    public TextField getTfChangedGeburtstag() {

        return tfChangedGeburtstag;
    }
    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submit(ActionEvent event) {
        Eingabe = tfChangedGeburtstag.getText();
        System.out.println(Eingabe);
    }
}
