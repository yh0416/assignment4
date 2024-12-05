package com.assignment4;

import com.assignment4.database.DatabaseConnection;
import com.assignment4.database.DatabaseFactory;

public class Main {
    public static void main(String[] args) {
        // Create a MySQL connection using the factory
        DatabaseConnection mysqlDb = DatabaseFactory.createConnection("mysql");

        // Use the MySQL connection
        mysqlDb.connect();
        mysqlDb.executeQuery("SELECT * FROM users");
        mysqlDb.disconnect();

        // Create a PostgreSQL connection using the same factory
        DatabaseConnection postgresDb = DatabaseFactory.createConnection("postgresql");

        // Use the PostgreSQL connection
        postgresDb.connect();
        postgresDb.executeQuery("SELECT * FROM products");
        postgresDb.disconnect();
    }
}
