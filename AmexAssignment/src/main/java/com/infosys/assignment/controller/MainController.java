package com.infosys.assignment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.assignment.beans.Person;
import com.infosys.assignment.service.PersonServiceimpl;

@RestController
public class MainController {

    @Autowired
    private PersonServiceimpl psi;
    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public Person findByName(@PathVariable int id) {
        return psi.findById(id);
    }
}