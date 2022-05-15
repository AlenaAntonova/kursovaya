package com.example.kursovaya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML private void handleButtonAction (ActionEvent event) throws IOException {
        //Close current
        Stage stage = (Stage) loginSignUpButton.getScene().getWindow();
        // do what you have to do
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Другая форма");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        logInButton.setOnAction(actionEvent -> {
            System.out.println("");

        });
        assert logInButton != null : "fx:id=\"logInButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
