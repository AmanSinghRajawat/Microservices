package com.vaccinationcenterservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vaccinationcenterservice.entity.VaccinationCenter;
import com.vaccinationcenterservice.model.RequiredResponse;
import com.vaccinationcenterservice.repository.VaccinationCenterRepository;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
	
	@Autowired
	private VaccinationCenterRepository vaccintionCenterRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String test() {
		return "Hello Vaccination Center...";
	}
	
	@PostMapping("/addVaccinationCenter")
	public VaccinationCenter addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		vaccintionCenterRepository.save(vaccinationCenter);
		return vaccinationCenter;
	}
	
	
//	@GetMapping("/vaccinationcenterid/{vaccinationCenterId}")
//	public Optional<VaccinationCenter> getVaccinationCenterById(@PathVariable long vaccinationCenterId) {
//		Optional<VaccinationCenter> vaccinationCenter = vaccintionCenterRepository.findById(vaccinationCenterId);
//		return vaccinationCenter;
//	}
	
	@GetMapping("/allVaccinationCenter")
	public List<VaccinationCenter> listOfAllVaccinationCenter(){
		return vaccintionCenterRepository.findAll();
	}
	
	
	@GetMapping("/vaccinationcenterid/{vaccinationCenterId}")
	public RequiredResponse getRequiredResponse(@PathVariable long vaccinationCenterId) {
		
		RequiredResponse requiredResponse = new RequiredResponse();
		
		// 1. get vaccintion center by id and set the vaccination center
		VaccinationCenter vaccinationCenter = vaccintionCenterRepository.findById(vaccinationCenterId).get();
		requiredResponse.setVaccinationCenter(vaccinationCenter);
		
		// 2. get all the people by vaccination center by id and set the list of people
		List listOfPeople = restTemplate.getForObject("http://localhost:8081/people/vaccinationCenterId/"+vaccinationCenterId, List.class);
		requiredResponse.setListOfPeoples(listOfPeople);
		
		return requiredResponse;
	}
	

}
