package com.ju.service;

import java.util.List;
import com.ju.dto.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	// Create New Student
    Student addNewStudent(Student student);

    // Search Students By Class
    Student getStudentByClass(String stuClass);
    
    // Update Student Address
    Student updateStudentAddress(int id, Student student);

    //Delete Student By ID
    void deleteStudentById(int id);


}
