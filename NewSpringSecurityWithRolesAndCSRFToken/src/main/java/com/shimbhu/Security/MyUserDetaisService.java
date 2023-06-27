package com.shimbhu.Security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shimbhu.Model.Customer;
import com.shimbhu.Repository.CustomerRepository;

@Service
public class MyUserDetaisService implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Customer> opt = customerRepository.findByEmail(username);
		
		if(opt.isPresent())
		{
			Customer customer = opt.get();
			
			return new MyUserDetails(customer);
		}
		else
		{
			throw new UsernameNotFoundException("Invalid Username or Email ");
		}
		
	}

}
