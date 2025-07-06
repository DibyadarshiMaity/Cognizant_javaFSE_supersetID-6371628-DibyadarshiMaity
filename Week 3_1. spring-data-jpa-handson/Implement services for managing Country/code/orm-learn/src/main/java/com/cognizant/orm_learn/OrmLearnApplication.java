package com.cognizant.orm_learn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.context.ApplicationContext;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;


@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
        testAddCountry();
        testFindByCode();
        testUpdateCountry();
        testDeleteCountry();
        testFindByPartialName();
    }

    private static void testGetAllCountries() {
        System.out.println("All Countries: " + countryService.getAllCountries());
    }

    private static void testAddCountry() {
        countryService.addCountry(new Country("XY", "Testland"));
    }

    private static void testFindByCode() {
        System.out.println("Find by Code (IN): " + countryService.findCountryByCode("IN"));
    }

    private static void testUpdateCountry() {
        Country country = countryService.findCountryByCode("XY");
        if (country != null) {
            country.setName("UpdatedLand");
            countryService.updateCountry(country);
        }
    }

    private static void testDeleteCountry() {
        countryService.deleteCountry("XY");
    }

    private static void testFindByPartialName() {
        System.out.println("Search 'land': " + countryService.findCountriesByName("land"));
    }
}



