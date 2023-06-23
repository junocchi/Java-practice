package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
/*
 * scan for all the classes in the mentioned package, and create the object of
 * classes Annotated with either @Component,@Service and @Repository
 */

@ComponentScan(basePackages = "com")
public class DvdConfig {

	// DriverManagerDataSource is responsible for registering the driver and
	// connecting to Database.
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/WileyDI004");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root-Juli-23");
		return driverManagerDataSource;
	}

	// JDBC Template is responsible for creating and executing the query
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

}
