package com.lodin.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.ObjectInputStream;

public class Main extends Application {
    @Override
    public void start(Stage primeryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primeryStage.setTitle("Login");
        primeryStage.setScene(new Scene(root,600,400));
        primeryStage.show();

    }

    public static void main(String[] args) {launch(args);}
}
