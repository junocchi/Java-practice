package com.ju.demo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ju.presentation.StudentPresentation;

@SpringBootApplication(scanBasePackages = "com.ju")
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class StudentsSpringbootJpaProjectApplication implements CommandLineRunner {

	@Autowired
	StudentPresentation studentPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentsSpringbootJpaProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			studentPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			studentPresentation.performMenu(choice);
		}
	}
}
