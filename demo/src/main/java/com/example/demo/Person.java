package com.example.demo;

public class Person {

    private String secondName;
    private String firstName;
    private String phoneNumber;
    private String source;
    private String residence;

    public Person(String firstName, String secondName, String phoneNumber, String residence, String source){
        this.secondName = secondName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.source = source;
        this.residence = residence;
    }

    public boolean isValidPhoneNumber(){
        return true;
    }

    public String getSecondName(){return this.secondName;}
    public String getFirstName(){return this.firstName;}
    public String getPhoneNumber(){return this.phoneNumber;}
    public String getSource(){return this.source;}
    public String getResidence(){return this.residence;}
}
