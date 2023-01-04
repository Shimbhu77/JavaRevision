package com.shimbhu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
    SecurityFilterChain mySecurity(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests( (auth) ->
		  auth.antMatchers("/masai/User/Portal").authenticated()
		  .antMatchers("/masai/Admin/Portal").hasRole("Admin")
		  .antMatchers("/masai/User").hasRole("User")
		  .antMatchers("/masai/home","/masai/home/register").permitAll()
				).csrf().disable().httpBasic();
		
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
