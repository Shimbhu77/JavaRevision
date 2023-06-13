package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceDetails implements UserDetailsService {

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Student st = sRepo.findByEmail(username);
		
		if(st!=null)
		{
			return new StudentDetails(st);
		}
		
		throw new BadCredentialsException(username+" not exists. ");
		
	}

}
