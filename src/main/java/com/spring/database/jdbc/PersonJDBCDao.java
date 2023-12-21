package com.spring.database.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.bean.PersonBean;


@Repository
public class PersonJDBCDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	
	class PersonRowMapper implements org.springframework.jdbc.core.RowMapper<PersonBean>{

		@Override
		public PersonBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			PersonBean person = new PersonBean();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			return person;
		}
		
	}
	
	
	public List<PersonBean> SelectAllPersons(){
		/*
		 * if you do not want your customized row mapper use this commented by defualt mapper if structure of bean feilds and db columns same 
		return jdbcTemplate.query("\nSelect * from person", new BeanPropertyRowMapper<PersonBean>(PersonBean.class));
		 */
		
		return jdbcTemplate.query("\nSelect * from person", new PersonRowMapper());
		
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	public List<PersonBean> SelectPersonById(int id){
		
		Object[] args = new Object[]{id};
		
		return jdbcTemplate.query("Select * from person where id=?", args,new PersonRowMapper());
		
	}
	
	
	public int deletePersondById(int id){
		
		Object[] args = new Object[]{id};
		
		return jdbcTemplate.update("delete from person where  id=?", args);
		
	}

	
	public int insertPerson(PersonBean person) {
		Object[] args = new Object[] {person.getId(),person.getName(),person.getLocation(),person.getBirthDate()};
		
		return jdbcTemplate.update("insert into person (id,name,location,birth_date) values(?,?,?,?)",args);			
				
	}

	public int updatePerson(PersonBean person) {
		Object[] args = new Object[] {person.getId(),person.getName()};
		
		return jdbcTemplate.update("update person set name = 'dewsolutions' where id=? and name=?",args);
	
				
				
	}
}
