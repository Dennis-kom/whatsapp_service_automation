package com.example.demo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.Arrays;

public class Table<T> extends Data implements ExeConfig{

    ArrayList<String> tableHeader = new ArrayList<>();
    ObservableList<Person> DemoPersons;
    public Table(){
        super();

        //TODO: update it to relevant conditioning when all the elements will be done
        if (!PROD_SOURCE){

            String[] Demo = {"בחירה","שם","משפחה","טלפון","מקור","עיר מחגורים"};
            tableHeader.addAll(Arrays.asList(Demo));

            ObservableList<Person> DemoPersons = FXCollections.observableArrayList(
                    new Person("שולה","שושני","054-1111235","whatsapp","עכו"),
                    new Person("קארין","מלכה","050-9897512","whatsapp","חיפה"),
                    new Person("אסתי","סרוסי","057-7744552","email","טירת כרמל"),
                    new Person("מורן","אטיאס","052-1548763","email","טירת כרמל"),
                    new Person("הילה","קופלר","058-7878787","whatsapp","חיפה"));
        }

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
