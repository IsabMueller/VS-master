package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoginController{


    @FXML
    private Button btnCancel;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private TextField tfUsername;
    @FXML
    private BorderPane loginPane;


    public TextField getTfUsername() {
        return tfUsername;
    }

    public PasswordField getTfPassword() {
        return tfPassword;
    }

    public String Username;
    public String Password;


    public void submitBtnLogin(ActionEvent event) {
        Username = tfUsername.getText();
        Password = tfPassword.getText();
            if (Username.isEmpty()||Password.isEmpty()){
                System.out.println("Fehler!");
            }
            else {
                CloseableHttpClient httpclient = HttpClients.createDefault(); {
                    HttpPost httpPost = new HttpPost("https://www.sharing-time.rest/auth/login");
                    List<NameValuePair> nvps = new ArrayList<>();
                    nvps.add(new BasicNameValuePair("username", Username));
                    nvps.add(new BasicNameValuePair("password", Password));
//request token
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
                        try (OutputStream outputStream = Files.newOutputStream(Paths.get("post.txt"))) {
                            long length = entity2.getContent().transferTo(outputStream);
                            System.out.println("Bytes uebertragen: " + length);
                            //weiter zu start
                            //auth abfrage schaffen!
                            AnchorPane newPane = null;
                            try {
                                newPane = FXMLLoader.load(getClass().getResource("../view/Start.FXML"));
                            }
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                            loginPane.getChildren().setAll(newPane);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }


    public void handleBtnCancel(ActionEvent event) {
        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("../view/Willkommen.FXML"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        loginPane.getChildren().setAll(newPane);
    }
}
