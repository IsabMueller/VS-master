package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class TerminNeuController {

   // @FXML
    //private ComboBox ComboboxWiederholen;
  //  @FXML
   // private ColorPicker ChangeColorTermin;
  //  @FXML
  //  private ComboBox comboboxErinnerung;
   // @FXML
   // private ComboBox comboboxKategorie;
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

    public String vonStd;
    public String vonMin;
    public String bisStd;
    public String bisMin;
    public String terminName;
  //  public Date date;



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

    /**
     * Controller zum Erstellen eines neuen Termins
     * @param actionEvent
     */

    public void submitBtnOK(ActionEvent actionEvent) {

        vonMin = tfVonMin.getText();
        vonStd = tfVonStd.getText();
        bisMin = tfBisMin.getText();
        bisStd = tfBisStd.getText();
        terminName = textFieldName.getText();

        System.out.println(vonStd);
        System.out.println(vonMin);
        System.out.println(bisMin);
        System.out.println(bisStd);
        System.out.println(terminName);
      //  LocalDate date = dpTerminNeu.getValue();


    }



}
