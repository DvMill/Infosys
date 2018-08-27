package com.infosys.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.assignment.beans.Person;

@Service
public interface PersonService {
	public Person findById(int id);
}