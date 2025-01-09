package com.example.demo;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {

    private final SimpleBooleanProperty check;
    private final SimpleStringProperty secondName;
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty phoneNumber;
    private final SimpleStringProperty source;
    private final SimpleStringProperty residence;

    public Person(boolean check, String firstName, String secondName, String phoneNumber, String residence, String source){
        this.check = new SimpleBooleanProperty(check);
        this.secondName = new SimpleStringProperty(secondName);
        this.firstName = new SimpleStringProperty(firstName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.source = new SimpleStringProperty(source);
        this.residence = new SimpleStringProperty(residence);
    }

    public boolean isValidPhoneNumber(){
        return true;
    }
    public boolean getCeckVal(){return check.get();}
    public String getSecondName(){return secondName.get();}
    public String getFirstName(){return firstName.get();}
    public String getPhoneNumber(){return phoneNumber.get();}
    public String getSource(){return source.get();}
    public String getResidence(){return residence.get();}

    public void aetCheck(boolean var) {check.set(var);}
    public void setSecondName(String data){ secondName.set(data);}
    public void setFirstName(String data){ firstName.set(data);}
    public void setPhoneNumber(String data){ phoneNumber.set(data);}
    public void setSource(String data){ source.set(data);}
    public void setResidence(String data){ residence.set(data);}
}
