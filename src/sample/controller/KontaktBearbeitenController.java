package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KontaktBearbeitenController {
    @FXML
    private TextField addUsername;
    @FXML
    private TextField addSurname;
    @FXML
    private TextField addName;
    @FXML
    private TextField addBirthday;
    @FXML
    private TextField addEmail;
    @FXML
    private AnchorPane ContactEdit;
    @FXML
    private Button btnBackAdressbook;
    @FXML
    private Button btnaddfriend;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "KontaktBearbeiten"
     * @param event Wechsel zum GUI "Adressbuch"
     * @throws IOException
     */    public void btnandlebackContacts(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Adressbuch.fxml"));
        ContactEdit.getChildren().setAll(newPane);
    }
}
