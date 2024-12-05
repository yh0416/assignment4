package com.assignment4.database;

/**
 * @author Morgan
 * @version 1.0
 */

public class DatabaseService {
    public void connect(){
        System.out.println("Connecting to database");
    }

    public void executeQuery(String query){
        System.out.println("Executing query: " + query);
    }

    public void disconnect() {
        System.out.println("Disconnecting from database...");
    }
}


