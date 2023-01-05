package com.shimbhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shimbhu.model.User;
import com.shimbhu.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User registerUser(User user) {
	 
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return  userDao.save(user);
	}

	@Override
	public User getCurrentLoggedInUser() {
		
		SecurityContext sc  = SecurityContextHolder.getContext();
		
		Authentication auth  = sc.getAuthentication();
		
		String userName = auth.getName();
		
		User user = userDao.findByName(userName);
		
		return user;
	}

}
