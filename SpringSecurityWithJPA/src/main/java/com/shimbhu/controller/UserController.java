package com.shimbhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shimbhu.exceptions.UserException;
import com.shimbhu.model.User;
import com.shimbhu.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	@PostMapping("/masai/User/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) throws UserException
	{

		User p = uService.registerUser(user);
		
		return new ResponseEntity<User>(p,HttpStatus.CREATED);
	}
	
	@GetMapping("/masai/Welcome")
	public ResponseEntity<String> LoginUserWelcome() throws UserException
	{

		String p = "Welcome to Masai Website";
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	
	@GetMapping("/masai/Welcome/User/Admin")
	public ResponseEntity<String> LoginUserAdmin() throws UserException
	{

		String p = "Welcome to Masai Admin portal";
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	
	@GetMapping("/masai/Welcome/User")
	public ResponseEntity<String> LoginUser() throws UserException
	{

		String p = "Welcome to Masai user portal";
		
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
}
