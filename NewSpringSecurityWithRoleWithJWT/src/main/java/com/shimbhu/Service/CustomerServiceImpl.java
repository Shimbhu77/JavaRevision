package com.shimbhu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shimbhu.Exceptions.CustomerException;
import com.shimbhu.Model.Customer;
import com.shimbhu.Repository.CustomerRepository;
import com.shimbhu.Security.MyUserDetails;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer registerUser(Customer customer) throws CustomerException {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer getUserByEmail(String email) throws CustomerException {
		
		Optional<Customer> opt = customerRepository.findByEmail(email);
		
		if(opt.isPresent())
		{
			Customer customer = opt.get();
			
			return customer;
		}
		else
		{
			throw new CustomerException("Invalid User Email ");
		}
	}

	@Override
	public List<Customer> getAllUsers() throws CustomerException {
		
		
		return customerRepository.findAll();
	} 

}
