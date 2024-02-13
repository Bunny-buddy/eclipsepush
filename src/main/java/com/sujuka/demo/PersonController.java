package com.sujuka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
	@Autowired
	private IPersonRespository repo;

	@PostMapping("save")
	public ResponseEntity<Person> saveperson(@RequestBody Person person) {
		System.out.println(person);
		repo.save(person);
		return new ResponseEntity<Person>(person, HttpStatus.CREATED);

	}

	@GetMapping("/pptnum/{pnum}")
	public ResponseEntity<Person> getPersonByPassportNum(@PathVariable("pnum") String pnum) {
		Person person = repo.getPersonByPassportnum(pnum);
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("pname/{name}")
	public ResponseEntity<Passport> getPassportByPersonName(@PathVariable("name") String name){
	Passport passport=repo.getPassportByPersonName(name);
	return ResponseEntity.ok(passport);
	}

}
