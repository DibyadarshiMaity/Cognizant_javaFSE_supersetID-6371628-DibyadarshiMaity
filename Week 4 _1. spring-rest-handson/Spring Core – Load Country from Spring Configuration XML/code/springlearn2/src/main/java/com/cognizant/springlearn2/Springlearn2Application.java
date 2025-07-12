package com.cognizant.springlearn2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springlearn2Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Springlearn2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Springlearn2Application.class, args);
        displayCountry();
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country)context.getBean("country");
        LOGGER.debug("Country : {}", country.toString());
    }
}

