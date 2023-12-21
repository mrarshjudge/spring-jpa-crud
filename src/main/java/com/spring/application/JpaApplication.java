package com.spring.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import com.spring.database.jpa.PersonJpaRepository;

@SpringBootApplication
@ComponentScan("com.spring")
public class JpaApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 1001 {}",repository.findById(10001));
		
	
			
	}

}
