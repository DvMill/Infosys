package com.infosys.assignment.service;

import java.util.List;

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
	public Person findByName(String Name) {
		String sql = "SELECT * FROM PERSON WHERE NAME=?";

		Person pep = (Person) jtm.queryForObject(sql, new Object[]{Name},
                new BeanPropertyRowMapper(Person.class));
        return pep;
	}

	@Override
	public List<Person> listPeople() {

        String sql = "SELECT * FROM PERSON";
		List<Person> person = jtm.query(sql, new BeanPropertyRowMapper<Person>(Person.class));

        return person;
	}
}