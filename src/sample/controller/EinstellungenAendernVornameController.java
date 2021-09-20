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
    private Button btnChangedVorname;
    @FXML
    private TextField tfChangedVorname;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane VornameChangePane;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "EinstellungenAenderVorname"
     * @param event Wechsel zum GUI "Profileinstellungen"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        VornameChangePane.getChildren().setAll(newPane);
    }
    //< Umwandlung der eingabe in das Textfeldes, in ein String
    String Eingabe;

    //< Methode zur Erfassung von der Eingabe in das Textfeld
    public TextField getTfChangedVorname() {
        return tfChangedVorname;
    }

    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submit(ActionEvent event) {
        Eingabe = tfChangedVorname.getText();
        System.out.println(Eingabe);
    }
}
