package com.shimbhu.Service;

import java.util.List;

import com.shimbhu.Exceptions.CustomerException;
import com.shimbhu.Model.Customer;

public interface CustomerService {

	public Customer registerUser(Customer customer) throws CustomerException;
	
	public Customer getUserByEmail(String email) throws CustomerException;
	
	public List<Customer>  getAllUsers() throws CustomerException;
	
	
}
