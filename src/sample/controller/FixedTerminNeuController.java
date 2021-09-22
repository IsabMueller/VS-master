package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FixedTerminNeuController {
    @FXML
    private AnchorPane BuildTermin;
    @FXML
    private DatePicker dpTerminNeu;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnOK;
    @FXML
    private TextField tfVonStd;
    @FXML
    private TextField tfVonMin;
    @FXML
    private TextField tfBisMin;
    @FXML
    private TextField tfBisStd;
    @FXML
    private TextField textFieldName;
    @FXML
    private ComboBox comboboxKategorie;
    @FXML
    private ComboBox comboboxErinnerung;
    @FXML
    private ComboBox ComboboxWiederholen;
    @FXML
    private ColorPicker ChangeColorTermin;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Willkommen"
     * @throws IOException
     */
    public void handleBtnBack(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        BuildTermin.getChildren().setAll(newPane);
    }

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "Start"
     * @param event Wechsel zum GUI "Willkommen"
     * @throws IOException
     */
    public void submitBtnOK(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        BuildTermin.getChildren().setAll(newPane);
    }

}
