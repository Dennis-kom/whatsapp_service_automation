package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private Button send_btn;

    @FXML
    private CheckBox gmail_checkbox;


    @FXML
    private CheckBox whataapp_checkbox;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        // TODO: connecting to all outer sources - gmail, whatsapp, google sheet
        // TODO: filling the table with content from the google sheet table
    }

    @FXML
    void sendPressed(ActionEvent event){
        System.out.println("button pressed");

    }

    @FXML
    void insertGmail(ActionEvent event){
        System.out.println("gmail checked");

    }

    @FXML
    void insertWhatsapp(ActionEvent event){
        System.out.println("insert Whatsapp");

    }


}