package com.ju.service;

import java.util.List;
import com.ju.dto.entity.Student;

public interface StudentService {

	// Create New Student
	public Student createNewStudent(Student student);

	// Get Students By Class
	public List<Student> getStudentsByClassNo(int classNo);

	// Update Student Address
	public Student updateAddress(int id, String adress);

	// Get Student By ID
	public Student getStudentById(int id);

	// Delete Student By ID
	public Student deleteStudentById(int id);

}
