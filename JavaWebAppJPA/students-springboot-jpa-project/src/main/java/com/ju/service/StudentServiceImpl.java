package com.ju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ju.dto.entity.Student;
import com.ju.persistence.StudentDao;

public class StudentServiceImpl implements StudentService {

	private final StudentDao studentDao;
	
	@Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
	
	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public Student addNewStudent(Student student) {
		String name = student.getName();
		String age = student.getAge();
		String stuClass = student.getStuClass();
		String address = student.getAddress();
		String phoneNumber = student.getPhoneNumber();

        if (name.isBlank()) {
            student.setName("Name blank, student NOT added");
        }

        if (age.isBlank()) {
            student.setAge("Age blank, student NOT added");
        }
        
        if (stuClass.isBlank()) {
            student.setStuClass("Class blank, student NOT added");
        }
        
        if (address.isBlank()) {
            student.setAddress("Address blank, student NOT added");
        }
        
        if (phoneNumber.isBlank()) {
            student.setPhoneNumber("Phone Number blank, student NOT added");
        }

        return studentDao.createNewStudent(student);
	}

	@Override
	public Student getStudentByClass(String stuClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudentAddress(int id, Student student) {
		if (id != student.getRollNo()) {
            student.setAddress("IDs do not match, student not updated");
            return student;
        }

        studentDao.updateStudent(student);

        return getStudentById(id);
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

}
