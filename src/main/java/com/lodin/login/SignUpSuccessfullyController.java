package com.lodin.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SignUpSuccessfullyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text SuccessRegistration;

    @FXML
    private Button homeButton;

    @FXML
    void homeButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) homeButton.getScene().getWindow();
        currentStage.close();

        scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


}
