
package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.Person;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.PersonRepository;
import java.util.ArrayList;
import java.util.List;


public class PersonService {
    
    private PersonRepository personRepository;
    
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
    //prints all persons 
    public List<Person> findAll() throws NoQueryPossibleException {
        List<Person> persons = new ArrayList<>();
        persons = personRepository.findAll();
        return persons;
    }
    
    public Person findById(int id) throws NoQueryPossibleException{
        return personRepository.findById(id);
    }
    
}
