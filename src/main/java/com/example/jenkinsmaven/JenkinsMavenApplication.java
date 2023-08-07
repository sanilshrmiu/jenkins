package com.example.jenkinsmaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JenkinsMavenApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsMavenApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Inside the application");
        SpringApplication.run(JenkinsMavenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("After the application is running");
    }
}
