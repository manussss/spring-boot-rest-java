package br.com.branq.model.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.branq.model.Person;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long>{

}
