package com.vaccinationcenterservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccinationCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vaccinationCenterId;
	private String name;
	private String city;
	private String address;
	
	
	public long getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(long vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public VaccinationCenter(long vaccinationCenterId, String name, String city, String address) {
		super();
		this.vaccinationCenterId = vaccinationCenterId;
		this.name = name;
		this.city = city;
		this.address = address;
	}
	
	
	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
