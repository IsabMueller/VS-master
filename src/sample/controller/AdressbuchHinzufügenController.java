package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdressbuchHinzufügenController {
    @FXML
    private Button btnaddfriend;
    @FXML
    private Button btnBackProfileinstellungen;
    @FXML
    private AnchorPane Kontakthinzufügen;
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

// Methode zum Rückkontakt
    public void btnandlebackContacts(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Adressbuch.fxml"));
        Kontakthinzufügen.getChildren().setAll(newPane);
    }
}
