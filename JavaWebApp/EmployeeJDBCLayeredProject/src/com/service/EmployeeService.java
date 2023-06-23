package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	boolean addEmployee(Employee employee);
}