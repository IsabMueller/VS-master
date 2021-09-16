package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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


    public String firstName;
    public String lastName;
    public String username;
    public String mail;
    public String mailRepeat;
    public String password;
    public String passwordRepeat;
    public LocalDate birthday;
    private int id;



    public void submitBtnReg(ActionEvent event) {

            firstName = tfRegVorname.getText();
            lastName = tfRegNachname.getText();
            username = tfRegUsername.getText();
            birthday = dpGeburtstag.getValue();
            mail = tfRegMail.getText();
            mailRepeat = tfRegMailwdh.getText();
            password = tfRegPw.getText();
            passwordRepeat = tfRegPwConfirm.getText();
            id = 0;     // id aufzählung? wie?

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || mail.isEmpty() || mailRepeat.isEmpty() || password.isEmpty() || password.isEmpty()){
            System.out.println("Felder ausfüllen");
        }
        else if (mail.equals(mailRepeat) && password.equals(passwordRepeat)) {

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(username);
            System.out.println(mail);
            System.out.println(mailRepeat);
            System.out.println(birthday);
            System.out.println(password);
            System.out.println(passwordRepeat);


        }

        else if (mail.equals(mailRepeat) && password.equals(passwordRepeat)) {
            CloseableHttpClient httpClient = HttpClients.createDefault(); {
                HttpPost httpPost = new HttpPost("https://www.sharing-time.rest/auth/register");
                List<NameValuePair> nvps = new ArrayList<>();
                nvps.add(new BasicNameValuePair("firstname", firstName));
                nvps.add(new BasicNameValuePair("lastname", lastName));
                nvps.add(new BasicNameValuePair("username", username));
                nvps.add(new BasicNameValuePair("mail", mail));
                nvps.add(new BasicNameValuePair("birthday", birthday));
                nvps.add(new BasicNameValuePair("password", password));

            }
        }


        else {
            System.out.println("Fehler!");
            //fensterpopup
        }
    }


}