package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo sRepo;
	
	
	@Override
	public Student registerUser(Student st) {
		
		return sRepo.save(st);
	}

	@Override
	public Student getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
