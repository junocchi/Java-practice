package com.service;

import java.util.List;

import com.entity.Employee;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeDao.addRecord(employee)>0;
	}

}