package com.hdfc.service;

import java.util.List;

import com.hdfc.entity.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);
	public Student getStudentByid(long id);
	public List<Student> getAllStudents();

}
