package com.spring.jpa.SpringJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProvider {

@Autowired
Repository repository;

public Person addPerson(Person person) {
	
	return repository.save(person);
}

public Optional<Person> getPerson(String id) {
	return repository.findById(id);
}

public String deletePerson(String id) {

	 repository.deleteById(id);
	return "Deleted";
}

public List<String> findByName(String name) {

	return repository.findByName(name);
	
}
}
