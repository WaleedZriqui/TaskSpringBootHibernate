package com.example.demo.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository
        extends JpaRepository<Person, Long> {

    Optional<Person> findPersonByName(String name);
    Optional<Person> findPersonById(Long Id);


    //Optional<Person> findCustomPerson(Character nameFirstChar,Integer minAge);

}
