package com.curso.validados.services;

import com.curso.validados.models.Person;
import com.curso.validados.repositories.PersonReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {


    //Injetar DP
    @Autowired
    private PersonReposirory personReposirory;

    //Métod0 para listar todas as pessoas
    public List<Person> listAllPerson() {

        List<Person> allPerson = new ArrayList<>();

        personReposirory.findAll().forEach(person -> {
            allPerson.add(person);
            System.out.println(person);
        });

        return allPerson;
    }

    //Métod0 para criar novo registro de pessoa
    public Person create(Person person){
        try{
            personReposirory.save(person);
            System.out.println("Registro criado com sucesso");
        } catch (Exception exception) {
                System.out.println(exception);
            }
        return person;
        }
    }



