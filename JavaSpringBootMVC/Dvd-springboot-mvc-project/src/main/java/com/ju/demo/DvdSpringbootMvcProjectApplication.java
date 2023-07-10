package com.ju.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.ju.dto.entity")
@SpringBootApplication(scanBasePackages = "com.ju")
@EnableJpaRepositories(basePackages = "com.ju.model.persistence")
public class DvdSpringbootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdSpringbootMvcProjectApplication.class, args);
	}

}
