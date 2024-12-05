package com.assignment4.database;

/**
 * PostgreSQL implementation of DatabaseConnection
 * @author Morgan
 * @version 1.0
 */
public class PostgreSQLConnection implements DatabaseConnection {
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    public PostgreSQLConnection() {
    }

    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }

    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}