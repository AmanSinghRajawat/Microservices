package com.vaccinationcenterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class VaccinationCenterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationCenterServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
