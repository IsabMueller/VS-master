package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class RegisterController {


    @FXML
    private Button btnReg;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField tfBirthday;
    @FXML
    private ImageView RegisterImageView;
    //@FXML
   // private TextField tfBirthday;
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
    //Methode von Zuweisung eines Buttons
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

    //public TextField getTfGeburtstag() {
      //  return tfBirthday;
   // }

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
    public String birthday;
    private int id;



    public void submitBtnReg(ActionEvent event) throws UnsupportedEncodingException {
//Stringzuordnung der TxtField eingabe
            firstName = tfRegVorname.getText();
            lastName = tfRegNachname.getText();
            username = tfRegUsername.getText();
            birthday = tfBirthday.getText();
            mail = tfRegMail.getText();
            mailRepeat = tfRegMailwdh.getText();
            password = tfRegPw.getText();
            passwordRepeat = tfRegPwConfirm.getText();
            id = 0;     // id aufzählung? wie?

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || mail.isEmpty() || mailRepeat.isEmpty() || password.isEmpty() || passwordRepeat.isEmpty()||(!(mail.equals(mailRepeat))) && (!(password.equals(passwordRepeat)))&&(!(password.equals(passwordRepeat)))&&(!(passwordRepeat.equals(password)))){
            System.out.println("Felder ausfüllen");
        }
        else {

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(username);
            System.out.println(mail);
            System.out.println(mailRepeat);
            System.out.println(birthday);
            System.out.println(password);
            System.out.println(passwordRepeat);


            CloseableHttpClient httpclient = HttpClients.createDefault();
            {
                HttpPost httpPost = new HttpPost("https://www.sharing-time.rest/auth/register");
                List<NameValuePair> nvps = new ArrayList<>();
                nvps.add(new BasicNameValuePair("firstName", firstName));
                nvps.add(new BasicNameValuePair("lastName", lastName));
                nvps.add(new BasicNameValuePair("username", username));
                nvps.add(new BasicNameValuePair("email", mail));
                nvps.add(new BasicNameValuePair("birthday", birthday));
                nvps.add(new BasicNameValuePair("password", password));
                httpPost.setEntity(new UrlEncodedFormEntity(nvps));
                try {
                    httpPost.setEntity(new UrlEncodedFormEntity(nvps));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }


                try (CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
                    // System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
                    HttpEntity entity2 = response2.getEntity();
                    // do something useful with the response body
                    // and ensure it is fully consumed
                    try (OutputStream outputStream = Files.newOutputStream(Paths.get("post1.txt"))) {
                        long length = entity2.getContent().transferTo(outputStream);
                        System.out.println("Bytes uebertragen: " + length);
                        AnchorPane newPane = null;
                        try {
                            newPane = FXMLLoader.load(getClass().getResource("../view/Start.FXML"));
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                     registrierenPane.getChildren().setAll(newPane);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                }
                }
                }
            }






