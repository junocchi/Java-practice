package com.ju.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ju.persistence.PersonDao;
import com.ju.persistence.VehicleDao;
import com.ju.dto.entity.Person;
import com.ju.dto.entity.Vehicle;

@SpringBootApplication(scanBasePackages = "com.ju")
@EntityScan(basePackages = "com.ju.dto.entity")
@EnableJpaRepositories(basePackages = "com.ju.persistence")
public class OneToManySpringbootJpaPersonVehicleApplication implements CommandLineRunner {

	@Autowired
	private PersonDao personDao;
	@Autowired
	private VehicleDao vehicleDao;

	public static void main(String[] args) {
		SpringApplication.run(OneToManySpringbootJpaPersonVehicleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vehicle v1 = new Vehicle(1, "Car", "Toyota Camry", "Red");
		Vehicle v2 = new Vehicle(2, "Motorcycle", "Honda CB500", "Black");
		Vehicle v3 = new Vehicle(3, "Truck", "Ford F-150", "Blue");
		Vehicle v4 = new Vehicle(4, "SUV", "Jeep Wrangler", "Green");
		Vehicle v5 = new Vehicle(5, "Van", "Mercedes-Benz Sprinter", "White");
		Vehicle v6 = new Vehicle(6, "Motorcycle", "Yamaha R6", "Yellow");
		Vehicle v7 = new Vehicle(7, "Car", "Chevrolet Cruze", "Silver");
		Vehicle v8 = new Vehicle(8, "Truck", "GMC Sierra", "Gray");
		Vehicle v9 = new Vehicle(9, "SUV", "Land Rover Range Rover", "Black");
		Vehicle v10 = new Vehicle(10, "Motorcycle", "Kawasaki Ninja 300", "Blue");
		Vehicle v11 = new Vehicle(11, "Car", "Honda Accord", "Red");
		Vehicle v12 = new Vehicle(12, "Truck", "Ram 1500", "White");
		Vehicle v13 = new Vehicle(13, "SUV", "Toyota RAV4", "Silver");
		Vehicle v14 = new Vehicle(14, "Van", "Ford Transit", "Black");
		Vehicle v15 = new Vehicle(15, "Car", "Volkswagen Golf", "Gray");

		Person p1 = new Person(1, "Grace", 32);
		p1.getVehicleList().add(v1);
		p1.getVehicleList().add(v3);
		p1.getVehicleList().add(v5);

		Person p2 = new Person(2, "Hannah", 27);
		p2.getVehicleList().add(v2);
		p2.getVehicleList().add(v4);
		p2.getVehicleList().add(v6);

		Person p3 = new Person(3, "Isabella", 31);
		p3.getVehicleList().add(v7);
		p3.getVehicleList().add(v9);
		p3.getVehicleList().add(v11);
		p3.getVehicleList().add(v13);
		p3.getVehicleList().add(v15);

		Person p4 = new Person(4, "Jasmine", 26);
		p4.getVehicleList().add(v8);
		p4.getVehicleList().add(v10);
		p4.getVehicleList().add(v12);
		p4.getVehicleList().add(v14);

		vehicleDao.save(v1);
		vehicleDao.save(v2);
		vehicleDao.save(v3);
		vehicleDao.save(v4);
		vehicleDao.save(v5);
		vehicleDao.save(v6);
		vehicleDao.save(v7);
		vehicleDao.save(v8);
		vehicleDao.save(v9);
		vehicleDao.save(v10);
		vehicleDao.save(v11);
		vehicleDao.save(v12);
		vehicleDao.save(v13);
		vehicleDao.save(v14);
		vehicleDao.save(v15);

		personDao.save(p1);
		personDao.save(p2);
		personDao.save(p3);
		personDao.save(p4);

	}

}
