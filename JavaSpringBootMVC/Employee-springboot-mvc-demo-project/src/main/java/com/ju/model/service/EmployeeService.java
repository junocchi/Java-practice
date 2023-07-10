package com.ju.model.service;

import java.util.List;

import com.ju.dto.entity.Employee;

public interface EmployeeService {

	Employee getEmployeeById(int empId);

	List<Employee> getAllEmployees();

	boolean addEmployee(Employee employee);

	boolean deleteEmployeeById(int empId);

	boolean incrementSalary(int empId, double incrementAmount);
}
