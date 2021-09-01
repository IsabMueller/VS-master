package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KontaktBearbeitenController {
    @FXML
    private AnchorPane ContactEdit;
    @FXML
    private Button btnBackAdressbook;
    @FXML
    private Button btnaddfriend;

    public void btnandlebackContacts(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Adressbuch.fxml"));
        ContactEdit.getChildren().setAll(newPane);
    }
}
