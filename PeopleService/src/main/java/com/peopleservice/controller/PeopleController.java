package com.peopleservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peopleservice.entity.People;
import com.peopleservice.repository.PeopleRepository;

@RestController
@RequestMapping("/people")
public class PeopleController {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@GetMapping("/test")
	public String test() {
		return "Hello People!..";
	}
	
	@PostMapping("/addPeople")
	public People addPeople(@RequestBody People people) {
		peopleRepository.save(people);
		return people;
	}
	
	@GetMapping("/peopleId/{id}")
	public Optional<People> getPeopleById(@PathVariable int id) {
		Optional<People> people = peopleRepository.findById(id);
		return people;
	}
	
	@GetMapping("/allPeople")
	public List<People> listOfAllPeople(){
		return peopleRepository.findAll();
	}
	
	@GetMapping("/vaccinationcenterid/{vaccinationCenterId}")
	public List<People> getPeopleByVaccinationId(@PathVariable long vaccinationCenterId){
		List<People> listOfPeopple = peopleRepository.findAllPeopleByVaccinationCenterId(vaccinationCenterId);
		return listOfPeopple;
	}
	
	

}
