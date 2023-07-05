package com.ju.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ju.dto.entity.Student;
import com.ju.persistence.StudentDao;

@SpringBootApplication
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class StudentsSpringbootJpaProjectApplication {

	@Autowired
	StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentsSpringbootJpaProjectApplication.class, args);
	}
	//@Override
	public void run(String... args) throws Exception {
		studentDao.save(new Student(101, "Jane Walker", "22", "Java", "15 Tree Street, London", "07776768989"));
		
	}
}
