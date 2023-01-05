package com.shimbhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shimbhu.model.User;
import com.shimbhu.repository.UserDao;
import com.shimbhu.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	@Autowired
	private UserDao uDao;
	
	@PostMapping("/masai/home/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) 
	{
		System.out.println("you registered successfully.");

		User p = uService.registerUser(user);
		
		return new ResponseEntity<User>(p,HttpStatus.CREATED);
	}
	
	@GetMapping("/masai/home")
	public ResponseEntity<String> UserWelcome()
	{

		String p = "Welcome to Masai Website";
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	
	@GetMapping("/masai/Admin/Portal")
	public ResponseEntity<String> LoginUserAdmin() 
	{

		String p = "Welcome to Masai Admin portal";
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	@GetMapping("/masai/LoggedInUser")
	public ResponseEntity<User> getCurrentLoggedInUser() 
	{
		
		User user = uService.getCurrentLoggedInUser();
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/masai/User/Portal")
	public ResponseEntity<String> LoginUser()
	{

       SecurityContext sc =SecurityContextHolder.getContext();
		
		
		Authentication auth=sc.getAuthentication();
		
		String p = "Welcome to Masai user portal : Welcome "+auth.getName();
		
		
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
}
