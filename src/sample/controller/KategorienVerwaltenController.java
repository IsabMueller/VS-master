package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.awt.*;
import java.io.IOException;



public class KategorienVerwaltenController {
    @FXML
    private Button btnKategorienAdd;
    @FXML
    private ColorPicker colorpickerKategorien;
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
     *
     * @param event Wechsel zum GUI "Einstellungen"
     * @throws IOException
     */
    public void handleBtnBackKategorienVerwalten(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("../view/Einstellungen.fxml"));
        KategorienVerwaltenPane.getChildren().setAll(newPane);
    }

    String kategorie;

    public TextField getTfKategorieName(){
        return tfKategorieName;
    }
    public void ChangeColor(ActionEvent event){
        Color Katcolor = colorpickerKategorien.getValue();
        tfKategorieName.setBackground(new Background(new BackgroundFill(Katcolor, null, null)));
    }

    public void submitKat(ActionEvent event) {
        kategorie = tfKategorieName.getText();
        System.out.println(kategorie);


        listKategorie.getItems().addAll(kategorie);



    }


}
