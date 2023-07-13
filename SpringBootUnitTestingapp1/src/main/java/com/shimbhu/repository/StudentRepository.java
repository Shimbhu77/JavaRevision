package com.shimbhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shimbhu.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
