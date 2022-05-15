package com.example.kursovaya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField lastName_fiekd;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private TextField name_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        assert lastName_fiekd != null : "fx:id=\"lastName_fiekd\" was not injected: check your FXML file 'login.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'login.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'login.fxml'.";
        assert name_field != null : "fx:id=\"name_field\" was not injected: check your FXML file 'login.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'login.fxml'.";

    }

}
