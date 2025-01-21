package com.green.odsaywebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OdsayWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdsayWebClientApplication.class, args);
    }

}
