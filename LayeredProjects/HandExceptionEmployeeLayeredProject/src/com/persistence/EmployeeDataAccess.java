package com.persistence;

import java.util.LinkedList;

import com.dto.Employee;

public interface EmployeeDataAccess {

	public boolean writeRecords(LinkedList<Employee> employees)throws Exception;
	public LinkedList<Employee> readRecords()throws Exception;
}