package com.example.online_bank_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class withdrawlController {

    @FXML
    private Button savings;

    @FXML
    void savingsOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("withdrawlamount.fxml"));
        Stage window=(Stage) savings.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));

    }

}
