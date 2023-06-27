package com.shimbhu.Security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain mySecurityConfig(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(
				(auth)-> auth
				.requestMatchers(HttpMethod.POST,"/app/customers").permitAll()
				.requestMatchers("/v3/api-docs/**", "/swagger-ui*/**", "/swagger-ui.html", "/swagger-ui/**/**").permitAll()
				.anyRequest().authenticated()
				).csrf(csrf -> csrf.disable())
		        .httpBasic(Customizer.withDefaults())
		        .formLogin(Customizer.withDefaults());
		
		 return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
