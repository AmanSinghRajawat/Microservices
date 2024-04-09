package com.vaccinationcenterservice.model;

import java.util.List;

import com.vaccinationcenterservice.entity.VaccinationCenter;

public class RequiredResponse {
	
	private VaccinationCenter vaccinationCenter;
	private List<People> listOfPeoples;
	
	
	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}
	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}
	public List<People> getListOfPeoples() {
		return listOfPeoples;
	}
	public void setListOfPeoples(List<People> listOfPeoples) {
		this.listOfPeoples = listOfPeoples;
	}
	
	public RequiredResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RequiredResponse(VaccinationCenter vaccinationCenter, List<People> listOfPeoples) {
		super();
		this.vaccinationCenter = vaccinationCenter;
		this.listOfPeoples = listOfPeoples;
	}	

}
