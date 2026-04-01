package com.curso.validados;

import com.curso.validados.models.Person;
import com.curso.validados.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadosApplication.class, args);

		testador();
	}


	//================== ZONA DE TESTE ================
	private static PersonService personService;

	public  ValidadosApplication(PersonService personService) {
		this.personService = personService;
	}
	public static void testador(){

		Person personA = new Person("Maria", 39, "m@ria.com", "00000000000");
		personService.create(personA);

	}
}
