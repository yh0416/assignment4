package com.assignment4.database;

/**
 * Factory class for creating database connections
 * @author Morgan
 * @version 1.0
 */
public class DatabaseFactory {
    /**
     * Creates a database connection based on the specified type
     * @param type Type of database connection to create
     * @return DatabaseConnection instance
     */
    public static DatabaseConnection createConnection(String type){
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQLConnection();
        } else if (type.equalsIgnoreCase("postgresql")) {
            return new PostgreSQLConnection();
        }
        throw new IllegalArgumentException("Unsupported database type: " + type);
    }
}
