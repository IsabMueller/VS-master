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
     * @param event Änderung des Geburtstages (Geburtsdatum)
     * @throws IOException Anzeigen der GUI ProfilEinstellungen
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
       GeburtstagChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe;

    //Methode zur Änderung des Geburtstages
    public TextField getTfChangedGeburtstag() {

        return tfChangedGeburtstag;
    }
    // Methode zur Ausgabe des Eingegebene Textfeldes
    public void submit(ActionEvent event) {
        Eingabe = tfChangedGeburtstag.getText();
        System.out.println(Eingabe);
    }
}
