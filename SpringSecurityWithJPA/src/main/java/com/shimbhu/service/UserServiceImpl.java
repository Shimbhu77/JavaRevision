package com.shimbhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shimbhu.exceptions.UserException;
import com.shimbhu.model.User;
import com.shimbhu.model.UserDTO2;
import com.shimbhu.repository.UserDao;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao uDao;
	
	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User registerUser(User user) throws UserException {

		User newUser = new User();
		
		newUser.setName(user.getName());
		newUser.setRole(user.getRole());
		newUser.setPassWord(passwordEncoder.encode(user.getPassWord()));
		newUser.setGender(user.getGender());
		
		return uDao.save(newUser);
	}

	@Override
	public String loginUser(UserDTO2 userDto) throws UserException {
		
		return "Welcome to Admin portal";
	}

}
