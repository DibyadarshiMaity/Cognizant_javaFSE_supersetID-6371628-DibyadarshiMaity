package com.cognizant.orm_learn.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
@Service
public class CountryService {
	 @Autowired
	    private CountryRepository countryRepository;
	 @Transactional
	    public void addCountry(Country country) {
	        countryRepository.save(country);
	    }

	  @Transactional
	    public Country findCountryByCode(String countryCode) throws CountryNotFoundException 
	  {
	        Optional<Country> result = countryRepository.findById(countryCode);
	        if (!result.isPresent()) 
	        {
	            throw new CountryNotFoundException("Country with code " + countryCode + " not found");
	        }
	        return result.get();
	    }

}
