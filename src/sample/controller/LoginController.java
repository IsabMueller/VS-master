package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;

import java.io.IOException;

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

    TextField Username;
    PasswordField Password;


    public void submitBtnLogin(ActionEvent event) {
        Username = getTfUsername();
        Password = getTfPassword();
       // hashCode(Password);
        // if else mit http request auf übereinstimmung von username und passwort überprüfen

    }



    public void handleBtnCancel(ActionEvent event) {{
        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("../view/Willkommen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        loginPane.getChildren().setAll(newPane);
    }
    }
}

