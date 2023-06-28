package com.shimbhu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shimbhu.Model.Customer;
import com.shimbhu.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/app/welcome")
	public ResponseEntity<String> welcomeMessage()
	{
		String message = "welcome to Shimbhu's Website";
		
		return new ResponseEntity<String>(message,HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/app/customers")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer)
	{
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		
		customer.setRole("ROLE_"+customer.getRole().toUpperCase());
		
		Customer savedCustomer = customerService.registerUser(customer);
		
		return new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/app/customers/{email}")
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable("email") String email)
	{
		Customer savedCustomer = customerService.getUserByEmail(email);
		
		return new ResponseEntity<Customer>(savedCustomer,HttpStatus.OK);
	}
	
	@GetMapping("/app/customers")
	public ResponseEntity<List<Customer>> getAllDetails()
	{
		
		System.out.println("unable to got all users");
		List<Customer> allCustomer = customerService.getAllUsers();
		
		return new ResponseEntity<List<Customer>>(allCustomer,HttpStatus.OK);
	}
	
	@GetMapping("app/signIn")
	public ResponseEntity<Customer> getLoggedInCustomerDetailsHandler(Authentication auth) throws BadCredentialsException{
		
		Customer customer= customerService.getUserByEmail(auth.getName());
		
		if(customer!=null)
		{
			 return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
		}
		
		throw new BadCredentialsException("Invalid Username or password");
		

	}
	
	@PostMapping("/contact")
	public String postDemo1() {
	     return "Not harmfull POST operation";
	}
	
	@PostMapping("/writeUs")
	public String postDemo2() {
		return " harmfull POST operation";
	}
	
	@PutMapping("/notice")
	public String putDemo1() {
	    return "Not harmfull PUT operation";
	}
}
