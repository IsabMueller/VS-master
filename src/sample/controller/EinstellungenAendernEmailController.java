package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EinstellungenAendernEmailController {
    @FXML
    private TextField tfEmailWiederholen;
    @FXML
    private TextField tfNeueEmail;
    @FXML
    private TextField tfAlteEmail;
    @FXML
    private AnchorPane EmailChangePane;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Button btnChangedEmail;

    /**
     *
     * @param event Änderung der Sicherheitseinstellungen (Änderung Mail-Adresse)
     * @throws IOException Anzeigen des GUI Sicherheitseinstellungen
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        EmailChangePane.getChildren().setAll(newPane);
    }
    //Textfeld Eingabe Auswerten
    String Eingabe1;
    String Eingabe2;
    String Eingabe3;

    public TextField getTfEmailWiederholen() {

        return tfEmailWiederholen;
    }
    public TextField getTfNeueEmail() {

        return tfNeueEmail;
    }
    public TextField getTfAlteEmail() {

        return tfAlteEmail;
    }

    public void submit(ActionEvent event) {
        Eingabe1 = tfEmailWiederholen.getText();
        Eingabe2 = tfNeueEmail.getText();
        Eingabe3 = tfAlteEmail.getText();


        System.out.println( '\n'+ Eingabe1  +'\n'+ Eingabe2 + '\n' + Eingabe3);
    }

}
