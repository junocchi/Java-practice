package com.ju.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
