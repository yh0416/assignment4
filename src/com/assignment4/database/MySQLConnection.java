package com.assignment4.database;

/**
 * MySQL implementation of DatabaseConnection
 * @author Morgan
 * @version 1.0
 */

public class MySQLConnection implements DatabaseConnection  {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }


    @Override
    public void disconnect() {
        System.out.println("Connecting to MySQL database...");
    }

    public MySQLConnection() {
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Connecting to MySQL database...");
    }
}
