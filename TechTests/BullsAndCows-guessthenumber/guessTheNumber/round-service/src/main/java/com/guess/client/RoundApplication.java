package com.guess.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.guess")
public class RoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoundApplication.class, args);
	}

}
