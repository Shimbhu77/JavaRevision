package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@PostMapping("/app/register-student")
	public ResponseEntity<Student> registerStudent(@RequestBody Student st)
	{
		String password = st.getPassword();
		
		st.setPassword(encoder.encode(password));
		
		Student st1 = sService.registerUser(st);
		
		return new ResponseEntity<Student>(st1,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/app/welcome")
	public ResponseEntity<String> registerStudent()
	{
		String str  = " Welcome to my Website ";
		return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/login/login-user")
	public ResponseEntity<String> loginUser()
	{
		 SecurityContext sc  = SecurityContextHolder.getContext();
			
			Authentication auth  = sc.getAuthentication();
			
			String userName = auth.getName();
			
			String str = "Welcome to Masai Website  : " + userName;
//		String str  = " Welcome to my Website ";//+ sService.getUserById();
		return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/signIn")
	public ResponseEntity<Student> getLoggedInCustomerDetailsHandler(Authentication auth) throws BadCredentialsException{
		
		
		Student customer= sRepo.findByEmail(auth.getName()) ; //.orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		
		if(customer!=null)
		{
			 return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
		}
		
		throw new BadCredentialsException("Invalid Username or password");
		 
		
	}	
}
