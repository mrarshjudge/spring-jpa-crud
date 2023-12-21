package com.spring.bean;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//********  This bean is used for JPA example ***********

@Entity
@Table(name = "employee")   // optional if table name same as Entity(class) name
public class EmployeeBean {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")   // optional if field name same as DB column name
	private String name;
	
	private String location;
	
	@Column(name = "birth_date")
	private Date birthDate;

	
	public EmployeeBean() {
		// you must have no arg constructor;
		
		super();
	}
	
	public EmployeeBean( String name, String location, Date birthDate) {
		super();
		// we are not defining id as it will be populated by hibernate owing to  @GeneratedValue
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate
				+ "]";
	}
	

}
