package br.com.branq.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.branq.model.Person;
import br.com.branq.model.interfaces.IPersonRepository;

//Essa anotacao serve para o sprint boot saber que vai ser injetado em runtime em outras classes da aplicacao
@Service
public class PersonService {

	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	@Autowired
	private IPersonRepository personRepository;
	
	public Person getById(Long id) throws ClassNotFoundException {
		
		logger.info("Finding by id");
		
		return personRepository
				.findById(id)
				.orElseThrow(() -> new ClassNotFoundException("No records found for this id"));
	}
	
	public List<Person> getAll() {
		
		logger.info("Finding people");
		
		return personRepository.findAll();
	}
	
	public Person createPerson(Person person) {
		
		logger.info("Saving person");
		
		return personRepository.save(person);
	}
	
    public Person updatePerson(Person person) throws ClassNotFoundException {
		
		logger.info("Updating person");
		
		var entity = personRepository
				.findById(person.getId())
				.orElseThrow(() -> new ClassNotFoundException("No records found for this id"));
		
		entity.setAddress(person.getAddress());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setGender(person.getGender());
		
		return personRepository.save(entity);
	}
    
    public void deletePerson(Long id) throws ClassNotFoundException {
		logger.info("Deleting person");
		
		var entity = personRepository
				.findById(id)
				.orElseThrow(() -> new ClassNotFoundException("No records found for this id"));
		
		personRepository.delete(entity);
	}
}
