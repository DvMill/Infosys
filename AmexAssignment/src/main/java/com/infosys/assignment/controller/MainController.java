package com.infosys.assignment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.assignment.beans.Person;
import com.infosys.assignment.service.PersonServiceimpl;

@RestController
public class MainController {

    @Autowired
    private PersonServiceimpl psi;

  /*  @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> listPeople() {
        
        return psi.listPeople();
    }*/
    @RequestMapping(value = "/person/{name}", method = RequestMethod.GET)
    public Person findByName(@PathVariable String name) {
    	Person r=psi.findByName(name);
    	System.out.println(r.toString());
        return r;
    }
}