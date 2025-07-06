package com.cognizant.orm_learn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import org.springframework.context.ApplicationContext;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;


@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;
    private static final Logger log = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testAddCountry();
   
    }

    private static void testAddCountry() {
        System.out.println("Start - testAddCountry");

        Country newCountry = new Country();
        newCountry.setCode("XY");
        newCountry.setName("Testland");

        countryService.addCountry(newCountry);

        try {
            Country addedCountry = countryService.findCountryByCode("XY");
            System.out.println("Added Country: " + addedCountry);
        } catch (CountryNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("End - testAddCountry");
    }
}



