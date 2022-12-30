package com.shimbhu.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shimbhu.model.User;
import com.shimbhu.repository.UserDao;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserDao uDao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = uDao.findByName(username);
		
		if(user!=null)
		{
			return new MyUserDetails(user);
		}
		
		throw new UsernameNotFoundException("No user found with this name "+username);
		
	}

}
