package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EinstellungenAendernUsernameController {
    @FXML
    private Button btnChangedUsername;
    @FXML
    private TextField tfChangedUsername;
    @FXML
    private Button btnBackSettings;
    @FXML
    private Pane usernameChangePane;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "EinstellungenAenderUsername"
     * @param event Wechsel zum GUI "ProfilEinstellungen"
     * @throws IOException
     */
    public void handleBtnBackSettings(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/ProfilEinstellungen.fxml"));
        usernameChangePane.getChildren().setAll(newPane);
    }
    //Umwandlung der eingabe in das Textfeldes, in ein String
    String Eingabe;

    // Methode zur Erfassung von der Eingabe in das Textfeld
    public TextField getTfChangedUsername() {

        return tfChangedUsername;
    }
    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submit(ActionEvent event) {
        Eingabe = tfChangedUsername.getText();
        System.out.println(Eingabe);
    }
}
