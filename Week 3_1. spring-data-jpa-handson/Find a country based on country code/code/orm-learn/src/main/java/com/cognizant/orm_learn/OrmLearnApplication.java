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

      testFindCountryByCode();
    }

    private static void testFindCountryByCode() {
        log.info("Start");
        try {
            Country country = countryService.findCountryByCode("IN");
            log.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            log.error("Exception: {}", e.getMessage());
        }
        log.info("End");
        //Exception handling for country code not found
        log.info("Start");
        try {
            Country country = countryService.findCountryByCode("XY");
            log.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            log.error("Exception: {}", e.getMessage());
        }
        log.info("End");
    }
}



