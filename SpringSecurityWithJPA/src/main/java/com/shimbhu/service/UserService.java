package com.shimbhu.service;

import com.shimbhu.exceptions.UserException;
import com.shimbhu.model.User;
import com.shimbhu.model.UserDTO2;

public interface UserService {

	public User registerUser(User userDto) throws UserException;
	public String loginUser(UserDTO2 userDto) throws UserException;
}
