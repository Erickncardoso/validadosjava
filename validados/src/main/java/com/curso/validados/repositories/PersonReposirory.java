package com.curso.validados.repositories;

import com.curso.validados.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonReposirory extends CrudRepository<Person, Integer> {
}
