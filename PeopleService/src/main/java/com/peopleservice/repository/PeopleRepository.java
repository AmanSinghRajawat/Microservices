package com.peopleservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peopleservice.entity.People;

public interface PeopleRepository extends JpaRepository<People, Integer> {

	List<People> findAllPeopleByVaccinationCenterId(long vaccinationCenterId);

}
