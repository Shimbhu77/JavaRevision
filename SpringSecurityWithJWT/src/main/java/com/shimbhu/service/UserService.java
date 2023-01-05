package com.shimbhu.service;

import com.shimbhu.model.User;

public interface UserService {

	public User registerUser(User user);
	public User getCurrentLoggedInUser();
}
