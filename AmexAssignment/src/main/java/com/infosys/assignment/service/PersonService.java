package com.infosys.assignment.service;

import org.springframework.stereotype.Service;

import com.infosys.assignment.beans.Person;

@Service
public interface PersonService {
	public Person findById(int id); // method to be called to find a person by id
}