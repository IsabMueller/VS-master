package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class AdressbuchController {
    @FXML
    private Button btnDelFriend;
    @FXML
    private Button btnEditFriend;
    @FXML
    private Button btnAddFriend;
    @FXML
    private AnchorPane neuerKalenderPane;
    @FXML
    private Button btnBackNeuerKalender;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Adressbuch"
     * @param event Wechsel zum GUI Hauptansicht
     * @throws IOException
     */
    public void handleBtnNeuerKalender(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        neuerKalenderPane.getChildren().setAll(newPane);
    }

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Adressbuch"
     * @param event Wechsel zum GUI "AdressbuchHinzufügen"
     * @throws IOException
     */
    public void btnhandleaddfriends(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/AdressbuchHinzufügen.fxml"));
        neuerKalenderPane.getChildren().setAll(newPane);
    }

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Adressbuch"
     * @param event Wechsel zum GUI "KontaktBearbeiten"
     * @throws IOException
     */
    public void BtnHandleEditFriends(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/KontaktBearbeiten.fxml"));
        neuerKalenderPane.getChildren().setAll(newPane);
    }
}

