package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.persistence.DvdDaoImpl;
import com.presentation.DvdUserInterfaceImpl;
import com.service.DvdServiceImpl;

@Configuration
public class DvdConfig {

	@Bean("dataAccess")
	public DvdDaoImpl getData() {
		return new DvdDaoImpl();
	}
	
	@Bean("service")
	public DvdServiceImpl service() {
		return new DvdServiceImpl(getData());
	}
	
	@Bean("userInterface")
	public DvdUserInterfaceImpl userInterface() {
		return new DvdUserInterfaceImpl(service());
	}
}