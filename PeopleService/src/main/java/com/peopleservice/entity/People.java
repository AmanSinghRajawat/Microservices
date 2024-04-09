package com.peopleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private long vaccinationCenterId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(long vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}
	
	
	public People(int id, String name, String city, long vaccinationCenterId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.vaccinationCenterId = vaccinationCenterId;
	}
	
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
