package com.shimbhu.Security;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.shimbhu.Filter.CsrfCookieFilter;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain mySecurityConfig(HttpSecurity http) throws Exception
	{
	// CORS configuration
		http.cors(cors -> {
			cors.configurationSource(new CorsConfigurationSource() {
				@Override
				public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
					
					CorsConfiguration cfg = new CorsConfiguration();
					cfg.setAllowedOriginPatterns(Collections.singletonList("*"));
					cfg.setAllowedMethods(Collections.singletonList("*"));
					cfg.setAllowCredentials(true);
					cfg.setAllowedHeaders(Collections.singletonList("*"));
					cfg.setExposedHeaders(Arrays.asList("Authorization"));
					
				   return cfg;
				};

		   });
		})
			
		.authorizeHttpRequests(
				(auth)-> auth
				.requestMatchers(HttpMethod.POST,"/app/customers").permitAll()
				.requestMatchers("/v3/api-docs/**", "/swagger-ui*/**", "/swagger-ui.html", "/swagger-ui/**/**").permitAll()
				.requestMatchers(HttpMethod.GET,"app/customers").hasRole("ADMIN")
				.requestMatchers(HttpMethod.GET,"app/customers/**","/welcome","/app/signIn").hasAnyRole("ADMIN","USER")
				.anyRequest().authenticated()
				)
		.csrf(csrf -> csrf.ignoringRequestMatchers("/notice","/contact","/app/customers")
				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
				).addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class)
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
