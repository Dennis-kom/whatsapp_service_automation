package com.example.demo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.Arrays;

public class Table<T> extends Data implements ExeConfig{

    ArrayList<String> tableHeader = new ArrayList<String>();
    ObservableList<Person> DemoPersons;
    public Table(){
        super();

        //TODO: update it to relevant conditioning when all the elements will be done
        if (!PROD_SOURCE){

            String[] Demo = {"שם","משפחה","טלפון","מקור","עיר מחגורים"};
            tableHeader.addAll(Arrays.asList(Demo));

            DemoPersons = FXCollections.observableArrayList(
                    new Person(false,"שולה","שושני","054-1111235","whatsapp","עכו"),
                    new Person(false,"קארין","מלכה","050-9897512","whatsapp","חיפה"),
                    new Person(false,"אסתי","סרוסי","057-7744552","email","טירת כרמל"),
                    new Person(false,"מורן","אטיאס","052-1548763","email","טירת כרמל"),
                    new Person(false,"הילה","קופלר","058-7878787","whatsapp","חיפה"));
        }

    }

    public Table(ObservableList<Person> people){
        super();
    }

    public ArrayList<String> getTableHeader(){
        return this.tableHeader;
    }

    public int getWidth(){
        return this.tableHeader.size();
    }

    public ObservableList<Person> getTableContent(){
        return DemoPersons;
    }
    public void build(){}

    public void load(){}

    public void clear(){}
}
