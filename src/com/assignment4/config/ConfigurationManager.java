package com.assignment4.config;

/**
 * @author Morgan
 * @version 1.0
 */

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String apiKey;
    private String databaseUrl;
    private int maxConnections;

    private ConfigurationManager() {
        databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        databaseUrl = "default-key";
        maxConnections = 100;

    }

    /**
     * @return
     */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public static void setInstance(ConfigurationManager instance) {
        ConfigurationManager.instance = instance;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        if (apiKey != null && !apiKey.trim().isEmpty()) {
            this.apiKey = apiKey;
        }

    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        if (databaseUrl != null && !databaseUrl.trim().isEmpty()) {
            this.databaseUrl = databaseUrl;
        }

    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        if (maxConnections > 0) {
            this.maxConnections = maxConnections;
        }

    }
}
