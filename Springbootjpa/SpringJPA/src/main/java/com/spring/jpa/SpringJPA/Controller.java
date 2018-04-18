package com.spring.jpa.SpringJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private ServiceProvider service;

	@RequestMapping(method=RequestMethod.POST,value="/person")
	public Person addNewPerson(@RequestBody Person person){
		return service.addPerson(person);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/person/{id}")
	public Optional<Person> getPerson(@PathVariable String id){
		return service.getPerson(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/deleteperson/{id}")
	public String deletePerson(@PathVariable String id){
		return service.deletePerson(id);
	}

	@RequestMapping(method = RequestMethod.GET , value= "/getPerson/{name}")
	public List<String> updatePersonNameById(String name){
		
		return service.findByName(name);
	}
}


