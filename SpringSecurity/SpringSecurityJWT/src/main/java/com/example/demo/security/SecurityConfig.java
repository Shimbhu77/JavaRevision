package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.example.demo.jwt.JWTGenerator;
import com.example.demo.jwt.JWTValidation;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {

	@Bean
    SecurityFilterChain mySecurity(HttpSecurity http) throws Exception
	{
		
		http
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/swagger-ui/**", "/javainuse-openapi/**").permitAll()
		.requestMatchers("/app/**").permitAll()
		.requestMatchers(HttpMethod.GET, "/login/**").hasRole("ADMIN")
		.requestMatchers(HttpMethod.GET, "/login/**").hasAnyRole("ADMIN","USER")		
		.anyRequest().authenticated().and()
		.addFilterAfter(new JWTGenerator(), BasicAuthenticationFilter.class)
		.addFilterBefore(new JWTValidation(), BasicAuthenticationFilter.class)
		.formLogin()
		.and()
		.httpBasic();
		
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
