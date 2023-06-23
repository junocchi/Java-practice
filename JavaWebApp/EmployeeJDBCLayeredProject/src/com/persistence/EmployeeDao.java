package com.persistence;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	int addRecord(Employee employee);
}