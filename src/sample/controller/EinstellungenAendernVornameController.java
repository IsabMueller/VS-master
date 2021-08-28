package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernVornameController {
    @FXML
    private TextField tfChangedVorname;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane VornameChangePane;

    /**
     *
     * @param event Änderung des Vornamens
     * @throws IOException Anzeigen des GUI "ProfilEinstellungen"
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        VornameChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe;

    public TextField getTfChangedVorname() {
        return tfChangedVorname;
    }

    public void submit(ActionEvent event) {
        Eingabe = tfChangedVorname.getText();
        System.out.println(Eingabe);
    }
}
