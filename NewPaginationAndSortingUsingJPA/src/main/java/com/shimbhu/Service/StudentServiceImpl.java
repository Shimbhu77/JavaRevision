package com.shimbhu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shimbhu.Model.Student;
import com.shimbhu.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sRepo;
	
	@Override
	public Student addStudent(Student student) {
	    
		return sRepo.save(student);
	}
	
	@Override
	public List<Student> getSortedStudentListWithField(String field, String direction) {
	
		Sort s = direction.equals("asc")? Sort.by(field).ascending() : Sort.by(field).descending();
		
		return sRepo.findAll(s);
	}

	@Override
	public List<Student> getAllStudentsPageWise(Integer pageNumber, Integer numberOfRecords) {
		
		Pageable p = PageRequest.of(pageNumber-1, numberOfRecords);
		//using method of PagingAndSortingRepository
		Page<Student> page= sRepo.findAll(p);
		//using JPQL
		//Page<Student> page= sRepo.getAllStudents(p);
		//List<Student> students= page.getContent();
//		Page<Student> page= sRepo.findByAddress("delhi",p);
		List<Student> students= page.getContent();
		return students;
	}


}
