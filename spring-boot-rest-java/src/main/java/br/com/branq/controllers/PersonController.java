package br.com.branq.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Person getById(@PathVariable(value = "id") String id) {
		return service.getById(id);
	}
	
	@GetMapping()
	public List<Person> getAll() {
		return service.getAll();
	}
}
