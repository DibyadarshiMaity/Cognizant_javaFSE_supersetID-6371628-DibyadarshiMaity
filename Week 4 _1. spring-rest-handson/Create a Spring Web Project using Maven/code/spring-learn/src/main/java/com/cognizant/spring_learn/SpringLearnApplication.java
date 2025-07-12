package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
     
		SpringApplication.run(SpringLearnApplication.class, args);
		log.info("springlearn running successfully");
	}

}
