package com.shimbhu.Security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.shimbhu.model.User;

public class MyUserDetails  implements  UserDetails{

	 
	private User user;
	
	public MyUserDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MyUserDetails(User user) {
		
		this.user = user;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		Collection<GrantedAuthority> autorities = new ArrayList<>();
	
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRole());
		
		autorities.add(simpleGrantedAuthority);
		
		return autorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassWord();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
