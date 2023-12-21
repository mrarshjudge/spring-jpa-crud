package com.spring.database.jpa;

import org.springframework.stereotype.Repository;

import com.spring.bean.EmployeeBean;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public EmployeeBean findById(int id) {
		return entityManager.find(EmployeeBean.class, id);
	}

	
}
