package com.abhijeet.poc.springbootmysqlpoc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijeet.poc.springbootmysqlpoc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findByFirstname(String firstName);

}
