package com.lodin.login;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField username_field;

    @FXML
    private Label loginResultLabel;


    @FXML
    void loginSignUpButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) signUpButton.getScene().getWindow();
        currentStage.close();

        scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
