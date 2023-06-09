package com.ju.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ju.dto.entity.Dvd;
import com.ju.persistence.DvdDao;

@SpringBootApplication
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class DvdSpringbootJpaProjectApplication implements CommandLineRunner {

	@Autowired
	DvdDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DvdSpringbootJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeDao.save(new Dvd(101, "Yellow", 5, "John Rock", "CoolStudio", 7));
		
	}

}