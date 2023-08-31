package com.hdfc.service;

import java.util.List;

import com.hdfc.entity.Student;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class StudentServiceImpl implements IStudentService {

	@Override
	@Transactional
	public Student addStudent(Student student) {
		student.persist();
		return student;
	}

	@Override
	public Student getStudentByid(long id) {
		return Student.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return Student.listAll();
	}

}
