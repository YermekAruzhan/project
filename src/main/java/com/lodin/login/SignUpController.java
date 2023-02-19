package com.lodin.login;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SignUpIIN;

    @FXML
    private TextField SignUpNumber;

    @FXML
    private PasswordField SignUpPassword;

    @FXML
    private TextField signUpUsername;

    @FXML
    private Button signUpbutton;


    private Connection connection = null;

    private void singUpNewUser() throws SQLException {
        DBMethods dbMethods = new DBMethods();
        connection = dbMethods.connect_to_db("postgres", "postgres", "a1r2u3k4a5");

        Registration registration = new Registration();

        String username = signUpUsername.getText();
        String iin = SignUpIIN.getText();
        String password = SignUpPassword.getText();
        String number = SignUpNumber.getText();

        User user = new User(username,iin,password,number);
        registration.register(user);
     }

    @FXML
    void userSignUpButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signUpSuccessfully.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) signUpbutton.getScene().getWindow();
        currentStage.close();
    }

    private void handle(ActionEvent event) throws SQLException {
        singUpNewUser();
    }
}
