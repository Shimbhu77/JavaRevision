package com.shimbhu.service;

import java.util.List;

import com.shimbhu.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public Student getStudentByRoll(Integer roll);
	
	public List<Student> getAllStudents();

}
