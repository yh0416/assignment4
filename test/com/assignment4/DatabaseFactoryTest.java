package com.assignment4;

import com.assignment4.database.DatabaseConnection;
import com.assignment4.database.DatabaseFactory;
import com.assignment4.database.MySQLConnection;
import com.assignment4.database.PostgreSQLConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseFactoryTest {
    @Test
    public void testCreateMySQLConnection() {
        DatabaseConnection connection = DatabaseFactory.createConnection("mysql");
        assertNotNull("Factory should create MySQL connection", connection);
        assertTrue("Should create MySQL connection instance", connection instanceof MySQLConnection);
    }

    @Test
    public void testCreatePostgreSQLConnection() {
        DatabaseConnection connection = DatabaseFactory.createConnection("postgresql");
        assertNotNull("Factory should create PostgreSQL  connection", connection);
        assertTrue("Should create PostgreSQL  connection instance", connection instanceof PostgreSQLConnection);
    }
}