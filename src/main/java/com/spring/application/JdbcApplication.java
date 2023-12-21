package com.spring.application;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.bean.PersonBean;
import com.spring.database.jdbc.PersonJDBCDao;

@SpringBootApplication
@ComponentScan("com.spring.database.jdbc")
public class JdbcApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJDBCDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		logger.info("All user ->{}",dao.deletePersondById(10001));
		
		logger.info("All user ->{}",dao.insertPerson(new PersonBean(1004, "Infosys","Pune",new Timestamp(System.currentTimeMillis()))));
		
		logger.info("All user ->{}",dao.updatePerson(new PersonBean(1004, "Infosys","Pune",new Timestamp(System.currentTimeMillis()))));
		
		logger.info("All user ->{}",dao.SelectAllPersons());
		
		logger.info("All user ->{}",dao.SelectPersonById(10002));
			
	}

}
