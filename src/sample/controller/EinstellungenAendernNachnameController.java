package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernNachnameController {
    @FXML
    private Button btnChangedNachname;
    @FXML
    private TextField tfChangedNachname;
    @FXML
    private Pane NachnameChangePane;
    @FXML
    private Button btnBackSettings;

    /**
     * Methode von Zuweisung eines Buttons
     * @param event Änderung des Vor- bzw. Nachnamenes
     * @throws IOException Anzeigen der GUI ProfilEinstellungen
     */

    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        NachnameChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe;

  //Methode zur Änderung des Nachnamenes
    public TextField getTfChangedNachname() {

        return tfChangedNachname;
    }
    // Methode zur Ausgabe des Eingegebene Textfeldes
    public void submit(ActionEvent event) {
        Eingabe = tfChangedNachname.getText();
        System.out.println(Eingabe);
    }
}
