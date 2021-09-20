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
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "EinstellungenAendernEmail"
     * @param event Wechsel zum GUI "SicherheitsEinstellung"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/SicherheitsEinstellungen.fxml"));
        EmailChangePane.getChildren().setAll(newPane);
    }
    //Umwandlung der eingabe in das Textfeldes, in ein String
    String Eingabe1;
    String Eingabe2;
    String Eingabe3;

    // Methode zur Erfassung von der Eingabe in das Textfeld
    public TextField getTfEmailWiederholen() {
        return tfEmailWiederholen;
    }

    public TextField getTfNeueEmail() {
        return tfNeueEmail;
    }

    public TextField getTfAlteEmail() {
        return tfAlteEmail;
    }
    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submit(ActionEvent event) {
        Eingabe1 = tfEmailWiederholen.getText();
        Eingabe2 = tfNeueEmail.getText();
        Eingabe3 = tfAlteEmail.getText();


        System.out.println( '\n'+ Eingabe1  +'\n'+ Eingabe2 + '\n' + Eingabe3);
    }

}
