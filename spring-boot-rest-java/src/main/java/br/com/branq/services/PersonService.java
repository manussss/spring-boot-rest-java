package br.com.branq.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.branq.model.Person;

//Essa anotacao serve para o sprint boot saber que vai ser injetado em runtime em outras classes da aplicacao
@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person getById(String id) {
		
		logger.info("returning new person");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setAddress("addres 1");
		person.setFirstName("first name");
		person.setLastName("last name");
		person.setGender("f");
		
		return person;
	}
}
