package com.assignment4.facade;

import com.assignment4.database.DatabaseService;

/**
 * Facade class that simplifies complex subsystem interactions
 * @author Morgan
 * @version 1.0
 */

public class SystemFacade {
    private DatabaseService database;
    private LoggingService logger;
    private AuthenticationService auth;

    public SystemFacade() {
        this.database = new DatabaseService();
        this.auth = new AuthenticationService();
        this.logger = new LoggingService();
    }

    /**
     * Performs a database operation with authentication and logging
     * @param credentials User credentials for authentication
     * @param query Database query to execute
     * @return boolean indicating operation success
     */
    public boolean performDatabaseOperation(String credentials, String query) {
        boolean success = false;

        if (auth.authenticate(credentials)) {
            database.connect();
            database.executeQuery(query);
            database.disconnect();
            logger.logOperation("Database operation completed");
            success = true;
        }

        return success;
    }

}
