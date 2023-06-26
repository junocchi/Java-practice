package com.ju.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ju")
public class MySecondRestApiDemoProjectApplicationWithArguments {

	public static void main(String[] args) {
		SpringApplication.run(MySecondRestApiDemoProjectApplicationWithArguments.class, args);
	}

}