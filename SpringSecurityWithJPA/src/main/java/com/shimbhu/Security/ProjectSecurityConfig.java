package com.shimbhu.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	public SecurityFilterChain MySecurityFilter(HttpSecurity http ) throws Exception
	{
		http.authorizeRequests( auth -> auth.
				antMatchers("masai/Welcome/User").authenticated()
				.antMatchers("masai/Welcome/User/Admin").hasRole("Admin")
				.antMatchers("masai/Welcome","/masai/User/register").permitAll())
		         .csrf().disable().httpBasic();
		
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
