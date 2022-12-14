package com.example.online_bank_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class withdrawlamountController {

    @FXML
    private Button no;

    @FXML
    private Button yes;
    @FXML
    private Label withdrawamount;

    @FXML
    void noOnAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Stage window=(Stage) no.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));

    }

    @FXML
    void yesOnAction(ActionEvent event) {

        withdrawamount.setText("THE AMOUNT HAS BEEN DEBITED");

    }

}
