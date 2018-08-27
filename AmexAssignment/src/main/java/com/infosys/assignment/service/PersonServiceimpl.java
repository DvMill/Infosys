package com.infosys.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.infosys.assignment.beans.Person;

@Service
public class PersonServiceimpl implements PersonService {

    @Autowired
    private JdbcTemplate jtm;

	@Override
	public Person findById(int id) {
		String sql = "SELECT * FROM PERSON WHERE ID=?";  // selected query to fetch a person from the h2 database

		Person pep = (Person) jtm.queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class)); // sends the query to db and gets the information and adds it to a new Person object
        return pep;
	}

}