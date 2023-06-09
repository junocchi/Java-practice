package com.ju.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}