package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;



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

    @FXML
    private TableView<Person> table = new TableView<Person>();

    LocalDataBuffer buffer = new LocalDataBuffer("path");

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        // TODO: connecting to all outer sources - gmail, whatsapp, google sheet
        // TODO: filling the table with content from the google sheet table
        table.setEditable(true);
        // TODO: load data to local data base from google sheet

        //Table data = buffer.getTable();
        Table data = new Table(); // loading table content - mock

        TableColumn checkValCol = new TableColumn("בחירה");
        checkValCol.setMinWidth(100);
        checkValCol.setCellValueFactory(new PropertyValueFactory<Person, String>("check"));


        TableColumn firstNameCol = new TableColumn("שם");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));

        TableColumn secondNameCol = new TableColumn("משפחה");
        secondNameCol.setMinWidth(100);
        secondNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("secondName"));

        TableColumn phoneNumCol = new TableColumn("טלפון");
        phoneNumCol.setMinWidth(100);
        phoneNumCol.setCellValueFactory(new PropertyValueFactory<Person, String>("phoneNumber"));


        TableColumn sourceCol = new TableColumn("מקור");
        sourceCol.setMinWidth(100);
        sourceCol.setCellValueFactory(new PropertyValueFactory<Person, String>("source"));


        TableColumn residenceCol = new TableColumn("עיר מחגורים");
        residenceCol.setMinWidth(100);
        residenceCol.setCellValueFactory(new PropertyValueFactory<Person, String>("residence"));

        table.setItems(data.getTableContent());
        table.getColumns().addAll(checkValCol, firstNameCol, secondNameCol, phoneNumCol, sourceCol,residenceCol );






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