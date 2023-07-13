package com.shimbhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shimbhu.model.Student;
import com.shimbhu.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@Valid @RequestBody Student student)
	{
		Student student1 = studentService.addStudent(student);
		
		return new ResponseEntity<Student>(student1,HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll)
	{
		Student student1 = studentService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentHandler()
	{
		List<Student> students = studentService.getAllStudents();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.ACCEPTED);
	}

}
