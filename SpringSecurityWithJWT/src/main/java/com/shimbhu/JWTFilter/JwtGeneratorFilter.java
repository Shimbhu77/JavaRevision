package com.shimbhu.JWTFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.shimbhu.JwtConstant.JwtConstant;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtGeneratorFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		    
		 SecurityContext securityContext = SecurityContextHolder.getContext();
		 
		 Authentication authentication =  securityContext.getAuthentication();
		 
		 
		 if(authentication!=null)
		 {
			 Date issueDate  = new Date();
			 Date expirationDate  = new Date();
			 
			 Calendar calendar = Calendar.getInstance();
			 
			 calendar.setTime(expirationDate);
			 
			 calendar.add(calendar.HOUR,7);
			 
			 SecretKey key = Keys.hmacShaKeyFor(JwtConstant.JWT_KEY.getBytes(StandardCharsets.UTF_8));
			 
			 String jwt = Jwts.builder().setIssuer("Shimbhu").setSubject("JWT Token")
					 .claim("username",authentication.getName())
					 .claim("authorities", authentication.getAuthorities())
					 .setIssuedAt(issueDate)
					 .setExpiration(calendar.getTime())
					 .signWith(key).compact();
			 
			 System.out.println(jwt);
			 
			 response.setHeader(JwtConstant.JWT_HEADER, jwt);
			 
			 filterChain.doFilter(request, response);

			 
		 }
		
	}
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
    	// TODO Auto-generated method stub
    	return !request.getServletPath().equals("/masai/User/Portal");
    }
}
