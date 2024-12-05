package com.assignment4;

import static org.junit.Assert.*;

import com.assignment4.config.ConfigurationManager;
import org.junit.Test;

public class ConfigurationManagerTest {
    @Test
    public void getInstance() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();
        // Verify they are the exact same instance (using assertSame)
        assertSame("Multiple calls to getInstance should return the same instance",
                instance1, instance2);

        // Also verify neither is null
        assertNotNull("getInstance should never return null", instance1);
    }

    @Test
    public void getApiKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String expectdDefault = "default-key";

        config.setApiKey(expectdDefault);
        assertEquals(expectdDefault, config.getApiKey());
    }

    @Test
    public void setApiKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String testKey = "test-api-key";

        config.setApiKey(testKey);
        assertEquals(testKey, config.getApiKey());


    }

    @Test
    public void getDatabaseUrl() {
        ConfigurationManager instance = ConfigurationManager.getInstance();
        String testurl = "dbc:mysql://localhost:3306/mydb";
        instance.setDatabaseUrl(testurl);
        assertEquals(testurl, instance.getDatabaseUrl());

    }

    @Test
    public void setDatabaseUrl() {
    }

    @Test
    public void getMaxConnections() {
        ConfigurationManager instance = ConfigurationManager.getInstance();
        int testConnections = 200;
        instance.setMaxConnections(testConnections);
        assertEquals(testConnections, instance.getMaxConnections());

    }

    @Test
    public void setMaxConnections() {
    }
}
