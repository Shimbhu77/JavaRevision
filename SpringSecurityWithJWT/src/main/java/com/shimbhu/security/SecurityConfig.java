package com.shimbhu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.shimbhu.JWTFilter.JwtGeneratorFilter;
import com.shimbhu.JWTFilter.JwtValidatorFilter;

@Configuration
public class SecurityConfig {

	@Bean
    SecurityFilterChain mySecurity(HttpSecurity http) throws Exception
	{
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeHttpRequests( (auth) ->
		  auth.antMatchers("/masai/User/Portal","/masai/LoggedInUser").authenticated()
		  .antMatchers("/masai/Admin/Portal").hasRole("Admin")
		  .antMatchers("/masai/home","/masai/home/register").permitAll()
				)
		.addFilterBefore(new JwtValidatorFilter(),BasicAuthenticationFilter.class)
		.addFilterAfter(new JwtGeneratorFilter(),BasicAuthenticationFilter.class)
		.csrf().disable().httpBasic();
		
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
