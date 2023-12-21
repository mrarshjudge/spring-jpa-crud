package com.spring.database.jpa;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.bean.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	//connect to the database
	@PersistenceContext
	private EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	
	}
}