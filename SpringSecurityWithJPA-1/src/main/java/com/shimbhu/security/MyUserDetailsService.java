package com.shimbhu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shimbhu.model.User;
import com.shimbhu.repository.UserDao;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userDao.findByName(username);
		
		if(user!=null)
		{
			return new MyUserDetails(user);
		}
		
		throw new UsernameNotFoundException("user not found with this username : "+username);
		
	}

}
