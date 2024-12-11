package com.example.demo;

public class LocalDataBuffer {

    public LocalDataBuffer(String data_file_path){

        System.out.println("Starting local Json Data buffer in location:" + data_file_path);
        //System.out.println("Locking Mux on data file");
        //System.out.println("Openning and read data from file");

    }

    private void dataFileMux(boolean status){
        System.out.println(status?"data file mux locked":"data file mux released");
    }

    public String getData(){
        dataFileMux(true);
        System.out.println("Reading data from file");
        dataFileMux(false);
        return "data from JSON";
    }

    public Table getTable(){
        return new Table();
    }

}
