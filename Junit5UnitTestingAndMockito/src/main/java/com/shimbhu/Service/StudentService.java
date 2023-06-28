package com.shimbhu.Service;

import java.util.List;

import com.shimbhu.Model.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public List<Student> getSortedStudentListWithField(String field, String direction);

	public List<Student> getAllStudentsPageWise(Integer pageNumber, Integer numberOfRecords);
}
