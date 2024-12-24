package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private TableView table = new TableView();

    LocalDataBuffer buffer = new LocalDataBuffer("path");

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        // TODO: connecting to all outer sources - gmail, whatsapp, google sheet
        // TODO: filling the table with content from the google sheet table
        table.setEditable(true);
        // TODO: load data to local data base from google sheet

        Table data = buffer.getTable();

        for ( headerNode: data.tableHeader){
            ArrayList headerLoaader<TableColumn> = new ArrayList<>();
            table.getColumns().addAll((new TableColumn<Person, String>((String) headerNode )).setCellValueFactory(););
        }
        table.setItems(data.getTableContent());
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