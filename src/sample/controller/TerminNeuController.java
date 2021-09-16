package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TerminNeuController {

    @FXML
    private ColorPicker ChangeColorTermin;
    @FXML
    private ComboBox comboboxErinnerung;
    @FXML
    private ComboBox comboboxKategorie;
    @FXML
    private TextField tfBisMin;
    @FXML
    private TextField tfBisStd;
    @FXML
    private TextField tfVonStd;
    @FXML
    private TextField tfVonMin;
    @FXML
    private TextField textFieldName;
    @FXML
    private DatePicker dpTerminNeu;
    @FXML
    private AnchorPane terminNeuPane;
    @FXML
    private Button btnOK;
    @FXML
    private Button btnBack;


    /**
     * Zurück zum GUI "Start"
     * @param event
     * @throws IOException
     */
    @FXML
    public void handleBtnBack(ActionEvent event) throws IOException{
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        terminNeuPane.getChildren().setAll(newPane);
    }

    public void submitBtnOK(ActionEvent event) {
    }




    /*
    combobox wiederholen füllen
    private void loadReminder() {
        comboboxErinnerung.getItems().add("keine Erinnerung");
        comboboxErinnerung.getItems().add("15m");
        comboboxErinnerung.getItems().add("30m");
        comboboxErinnerung.getItems().add("1h");
        comboboxErinnerung.getItems().add("2h");
        comboboxErinnerung.getSelectionModel().select(2);
    }*/

    /**
     * Controller zum Erstellen eines neuen Termins
     * @param actionEvent
     */
 
}
