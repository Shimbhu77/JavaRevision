package com.shimbhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimbhu.model.Student;
import com.shimbhu.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentByRoll(Integer roll) {
		
		return studentRepository.findById(roll).get();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
