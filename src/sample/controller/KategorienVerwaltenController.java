package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;



public class KategorienVerwaltenController {
    @FXML
    private Button btnKategorienLoeschen;
    @FXML
    private Button btnKategorienAendern;
    @FXML
    private Button btnKategorienAdd;
    @FXML
    private ListView listKategorie;
    @FXML
    private TextField tfKategorieName;
    @FXML
    private Button btnBackKategorienVerwalten;
    @FXML
    private AnchorPane KategorienVerwaltenPane;
    private String https;

    /**
     * Methode von Zuweisung eines Buttons
     * Controller Klasse für den Punkt "KategorienVerwalten"
     * @param event Wechsel zum GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnBackKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        KategorienVerwaltenPane.getChildren().setAll(newPane);
    }
    //Umwandlung der eingabe in das Textfeldes, in ein String
    String kategorie;

    // Methode zur Erfassung von der Eingabe in das Textfeld
    public TextField getTfKategorieName(){
        return tfKategorieName;
    }

    /**
     * Methode von Zuweisung der jeweiligen Textfelder in ein String
     * Wiedergabe durch System.out.println
     * @param event Ausgabe von eingebenem Text
     */
    public void submitKat(ActionEvent event) {
        kategorie = tfKategorieName.getText();
        System.out.println(kategorie);


        listKategorie.getItems().addAll(kategorie);



    }
    // Colorpicker removed
    /**
    *Colorpicker
    *public void ChangeColor(ActionEvent event){
    *    Color Katcolor = colorpickerKategorien.getValue();
    *    tfKategorieName.setBackground(new Background(new BackgroundFill(Katcolor, null, null)));
    *}
     */

}
