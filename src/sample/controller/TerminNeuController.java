package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


class TerminNeuControlle{


    @FXML
    private ComboBox comboboxErinnerung;
    @FXML
    private ColorPicker ChangeColorTermin;
    @FXML
    private ComboBox comboboxKategorie;
    @FXML
   private ComboBox ComboboxWiederholen;
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

    public String Erinnerung;
    public String vonStd;
    public String vonMin;
    public String bisStd;
    public String bisMin;
    public String terminName;
  //  public Date date;

/*
// keine Anzeige in box
    private void loadErinnerung() {
        comboboxErinnerung.getItems().add("Nein");
        comboboxErinnerung.getItems().add("5 Minuten");
        comboboxErinnerung.getItems().add("10 Minuten");
        comboboxErinnerung.getItems().add("30 Minuten");
        comboboxErinnerung.getItems().add("1 Stunde");
        comboboxErinnerung.getItems().add("2 Stunden");
        comboboxErinnerung.getItems().add("5 Stunden");
        comboboxErinnerung.getItems().add("1 Tag");
        comboboxErinnerung.getSelectionModel().select(2);
    }
*/


    /**
     * Zurück zum GUI "Start"
     * @param event
     */
    @FXML
    //Methode von Zuweisung eines Buttons
    public void handleBtnBack(ActionEvent event) throws IOException{
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        terminNeuPane.getChildren().setAll(newPane);
    }

    /**
     * Controller zum Erstellen eines neuen Termins
     * @param actionEvent
     */
    // Methode zur Ausgabe des Eingegebene Textfeldes
    public void submitBtnOK(ActionEvent actionEvent) {

        int vMin = 0;
        int vStd = 0;
        int bMin = 0;
        int bStd = 0;

        vonMin = tfVonMin.getText();
        vonStd = tfVonStd.getText();
        bisMin = tfBisMin.getText();
        bisStd = tfBisStd.getText();
        terminName = textFieldName.getText();
        Erinnerung = (String) comboboxErinnerung.getSelectionModel().getSelectedItem();

        System.out.println(vonStd);
        System.out.println(vonMin);
        System.out.println(bisMin);
        System.out.println(bisStd);
        System.out.println(terminName);
        System.out.println(Erinnerung);
      //  LocalDate date = dpTerminNeu.getValue();



    vMin=Integer.parseInt(vonMin);
    vStd=Integer.parseInt(vonStd);
    bMin=Integer.parseInt(bisMin);
    bStd=Integer.parseInt(bisStd);


    }



}
