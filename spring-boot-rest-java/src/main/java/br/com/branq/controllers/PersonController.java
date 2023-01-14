package br.com.branq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.branq.model.Person;
import br.com.branq.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	// o Spring boot vai cuidar da instanciacao
	@Autowired
	private PersonService service;
	
	@GetMapping("/{id}")
	public Person getById(@PathVariable(value = "id") Long id) throws ClassNotFoundException {
		return service.getById(id);
	}
	
	@GetMapping()
	public List<Person> getAll() {
		return service.getAll();
	}
	
	@PostMapping()
	public Person createPerson(@RequestBody Person person) {
		return service.createPerson(person);
	}
	
	@PutMapping()
	public Person updatePerson(@RequestBody Person person) throws ClassNotFoundException {
		return service.updatePerson(person);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatusCode deletePerson(@PathVariable(value = "id") Long id) throws ClassNotFoundException {
		service.deletePerson(id);
		
		return HttpStatusCode.valueOf(204);
	}
}
