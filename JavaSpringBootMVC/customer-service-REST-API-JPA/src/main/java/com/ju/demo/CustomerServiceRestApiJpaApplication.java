package com.ju.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ju")
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class CustomerServiceRestApiJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceRestApiJpaApplication.class, args);
	}

}
