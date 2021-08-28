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
    private TextField tfChangedGeburtstag;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane GeburtstagChangePane;

    /**
     *
     * @param event Änderung des Geburtstags (Geburtsdatum)
     * @throws IOException Anzeigen der GUI ProfilEinstellungen
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
       GeburtstagChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe;

    public TextField getTfChangedGeburtstag() {

        return tfChangedGeburtstag;
    }

    public void submit(ActionEvent event) {
        Eingabe = tfChangedGeburtstag.getText();
        System.out.println(Eingabe);
    }
}
