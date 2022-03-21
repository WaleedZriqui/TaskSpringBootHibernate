package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/persons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @GetMapping(path = "/person/{perId}")
    public Person getPersoWithId(@PathVariable("perId") Long Id){
        return personService.getPersonUisngID(Id);
    }

    @PostMapping(path = "/person")
    public void registerNewPerson(@RequestBody Person person){
        personService.addNewPerson(person);
    }

    @DeleteMapping(path = "person/{perId}")
    public void deletePerson(@PathVariable("perId") long id){
        personService.removePerson(id);
    }

    @PutMapping(path = "person")
    public void putPerson(@RequestBody Person person){
        personService.updatePerson(person);
    }
}
