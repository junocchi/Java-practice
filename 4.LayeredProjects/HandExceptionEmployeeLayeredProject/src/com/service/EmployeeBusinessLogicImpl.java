package com.service;

import java.util.LinkedList;


import com.dto.Employee;
import com.persistence.EmployeeDataAccess;
import com.persistence.EmployeeDataAccessImpl;

public class EmployeeBusinessLogicImpl implements EmployeeBusinessLogic {

	
	private EmployeeDataAccess dataAccess=new EmployeeDataAccessImpl();
	
	private LinkedList<Employee> employeeList;
	
	public EmployeeBusinessLogicImpl() {
		try {
			employeeList=dataAccess.readRecords();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public LinkedList<Employee> getAllEmployees() {
		
		return employeeList;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		
		return employeeList.add(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId())
				return employeeList.remove(employee);
		}
		return false;
	}
	
	//We cannot call directly a persistence layer method without declaring
	//it here first. Even if there's no logic, like this case.
	public void saveAllEmployees() {
		try {
			dataAccess.writeRecords(employeeList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Employee findEmployeeNameById(int idNum) {
		//picking one one object from employeeList collection and storing in employee object
		for(Employee employee:employeeList) {
			//is employee object have same id as that what user have entered
			if(employee.getEmpId()==idNum)
//				return the employee object
				return employee;
		}
		
		return null;
	}
	

}