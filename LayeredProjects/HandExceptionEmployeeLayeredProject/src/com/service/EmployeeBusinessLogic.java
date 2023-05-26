package com.service;

import java.util.LinkedList;

import com.dto.Employee;

public interface EmployeeBusinessLogic {

	LinkedList<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int id);
	public void saveAllEmployees();
	Employee findEmployeeNameById(int idNum);
}