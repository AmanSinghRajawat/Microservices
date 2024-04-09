package com.vaccinationcenterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccinationcenterservice.entity.VaccinationCenter;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Long> {

}
