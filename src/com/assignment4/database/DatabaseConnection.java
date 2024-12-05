package com.assignment4.database;

/**
        * Interface for different types of database connections
        * @author Morgan
        * @version 1.0
        */
public interface  DatabaseConnection {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
