package com.ju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.ju.dto.entity.Student;
import com.ju.persistence.StudentDao;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	@Autowired
	public StudentServiceImpl(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student createNewStudent(Student student) {
		if (getStudentById(student.getRollNo()) != null)
			return null;
		studentDao.save(student);
		return student;
	}

	@Override
	public List<Student> getStudentsByClassNo(int classNo) {
		return studentDao.getStudentsByClass(classNo);
	}

	@Override
	public Student updateAddress(int id, String adress) {
		Student student = getStudentById(id);
		student.setAddress(adress);

		studentDao.save(student);
		return student;
	}

	@Override
	public Student deleteStudentById(int id) {
		Student student = getStudentById(id);

		if (student == null)
			return null;

		studentDao.deleteById(id);
		return student;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = studentDao.findById(id);

		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

}
