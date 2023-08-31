package com.hdfc.controller;

import java.util.List;

import com.hdfc.entity.Student;
import com.hdfc.service.IStudentService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/student")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {
	
	@Inject
	IStudentService studentService;
	
	@POST
	public Student addStudent(Student student) {
		return studentService.addStudent(student);
	}
	
	@GET
	@Path("/{id}")
	public Student getStudentByid(long id) {
		return studentService.getStudentByid(id);
	}
	
	
	@GET
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
