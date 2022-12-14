package com.example.online_bank_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class dashboardController {

    @FXML
    private Button cashwithdraw;

    @FXML
    private Button deposit;

    @FXML
    void cashwithdrawOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("withdrawl.fxml"));
        Stage window=(Stage) cashwithdraw.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));

    }

    @FXML
    void depositOnAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("depositamount.fxml"));
        Stage window=(Stage) deposit.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(),600,400));

    }

}
