package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class TerminBearbeitenController {


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
    private DatePicker dpTerminEdit;
    @FXML
    private Button btnOK;
    @FXML
    private Button btnBack;
    @FXML
    private AnchorPane TerminBearbeitenPane;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "TerminBearbeiten"
     * @param event Wechsel zum GUI "Start"
     * @throws IOException
     */
    public void handleBtnBack(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        TerminBearbeitenPane.getChildren().setAll(newPane);
    }
}
