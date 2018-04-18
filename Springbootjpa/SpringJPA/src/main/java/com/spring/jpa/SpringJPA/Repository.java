package com.spring.jpa.SpringJPA;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface Repository extends CrudRepository<Person,String> {
	
	
	@Modifying
	@Transactional
	@Query("update Person p set p.name = :name where p.id = :id")
	Integer updatePersonNameById(@Param("id") String id,@Param("name") String name);
	
	@Query("SELECT P.id FROM Person P WHERE P.name = :name")
	List<String> findByName(@Param("name") String name);
	
}
