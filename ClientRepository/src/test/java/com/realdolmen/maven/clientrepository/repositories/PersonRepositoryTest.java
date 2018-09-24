/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.clientrepository.repositories;

import com.realdolmen.maven.clientrepository.domain.Person;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonRepositoryTest {
    
    @Test
    public void testFindAll() throws NoQueryPossibleException{
        PersonRepository personRepository = new PersonRepository();
        List<Person> persons = personRepository.findAll();
        assertFalse(persons.isEmpty());
    }
    
}
