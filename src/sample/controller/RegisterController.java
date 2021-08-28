package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



import java.io.IOException;
import java.time.LocalDate;


public class RegisterController {

    @FXML
    private DatePicker dpGeburtstag;
    @FXML
    private TextField tfRegMailwdh;
    @FXML
    private TextField tfRegVorname;
    @FXML
    private TextField tfRegNachname;
    @FXML
    private TextField tfRegUsername;
    @FXML
    private TextField tfRegMail;
    @FXML
    private TextField tfRegPw;
    @FXML
    private TextField tfRegPwConfirm;
    @FXML
    private Button registrierenButton;
    @FXML
    private BorderPane registrierenPane;
    @FXML
    private Button btnAbbrechen;



    /**
     *  zurück zum GUI Willkommen
     */
    @FXML
    public void handleBtnAbbrechen(ActionEvent actionEvent){
        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("../view/Willkommen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        registrierenPane.getChildren().setAll(newPane);
    }


    public TextField getTfRegVorname() {
        return tfRegVorname;
    }

    public DatePicker getDpGeburtstag() {
        return dpGeburtstag;
    }

    public TextField getTfRegNachname() {
        return tfRegNachname;
    }

    public TextField getTfRegUsername() {
        return tfRegUsername;
    }

    public TextField getTfRegMail() {
        return tfRegMail;
    }

    public TextField getTfRegMailwdh() {
        return tfRegMailwdh;
    }

    public TextField getTfRegPw() {

        return tfRegPw;
    }
    public TextField getTfRegPwConfirm(){
        return tfRegPwConfirm;
    }


    public String Vorname;
    public String Nachname;
    public String Username;
    public String Mail;
    public String Mailwdh;
    public String Passwort;
    public String Passwortwdh;
    public LocalDate Geburtsdatum;
    private int id;



    public void submitBtnReg(ActionEvent event) {

            Vorname = tfRegVorname.getText();
            Nachname = tfRegNachname.getText();
            Username = tfRegUsername.getText();
            Geburtsdatum = dpGeburtstag.getValue();
            Mail = tfRegMail.getText();
            Mailwdh = tfRegMailwdh.getText();
            Passwort = tfRegPw.getText();
            Passwortwdh = tfRegPwConfirm.getText();


        if (Mail.equals(Mailwdh) && Passwort.equals(Passwortwdh)) {

            System.out.println(Vorname);
            System.out.println(Nachname);
            System.out.println(Username);
            System.out.println(Mail);
            System.out.println(Mailwdh);
            System.out.println(Geburtsdatum);
            System.out.println(Passwort);
            System.out.println(Passwortwdh);

        }
        else if (Vorname.isEmpty() || Nachname.isEmpty() || Username.isEmpty() || Mail.isEmpty() || Mailwdh.isEmpty() || Passwort.isEmpty() || Passwort.isEmpty()){
            System.out.println("Felder ausfüllen");
        }
        else {
            System.out.println("Fehler!");
        }
    }


}