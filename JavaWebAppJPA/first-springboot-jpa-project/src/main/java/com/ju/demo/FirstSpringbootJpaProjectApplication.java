package com.ju.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ju.dto.entity.Employee;
import com.ju.persistence.EmployeeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class FirstSpringbootJpaProjectApplication implements CommandLineRunner {

	@Autowired
	EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeDao.save(new Employee(101, "AAAA", "Executive", "Sales", 56000));
		
	}

}