package com.sujata.employee.client;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sujata.employee.persistence.EmployeeDataAccess;
import com.sujata.employee.presentation.EmployeeUserInterfaceImpl;
import com.sujata.employee.service.EmployeeBussinessLogicImpl;
import com.sujata.employee.persistence.EmployeeDataAccessImpl;

@Configuration
public class EmployeeConfig {

	@Bean("dataAccess")
	public EmployeeDataAccessImpl employeeDataAccessImpl() {
		return new EmployeeDataAccessImpl();
	}

	@Bean("service")
	public EmployeeBussinessLogicImpl employeeBusinessLogicImpl() {
		return new EmployeeBussinessLogicImpl(employeeDataAccessImpl());
	}

	@Bean("userInterface")
	public EmployeeUserInterfaceImpl employeeUserInterfaceImpl() {
		return new EmployeeUserInterfaceImpl(employeeBusinessLogicImpl());
	}

}
