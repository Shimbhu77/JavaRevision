package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {

	public Student registerUser(Student st);
	public Student getUserById(Integer id);
}
