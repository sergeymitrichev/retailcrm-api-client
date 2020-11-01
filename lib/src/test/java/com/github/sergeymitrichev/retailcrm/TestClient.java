package com.github.sergeymitrichev.retailcrm;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestClient {

    private static RetailCrmApiClient instance;

    private TestClient() {}

    static {
        Properties configProps = new Properties();
        try(InputStream iStream = new ClassPathResource("test.properties").getInputStream()) {
            configProps.load(iStream);
            instance = new RetailCrmApiClient(
                    configProps.getProperty("site"),
                    configProps.getProperty("api-key")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RetailCrmApiClient getInstance() {
        return instance;
    }
}
