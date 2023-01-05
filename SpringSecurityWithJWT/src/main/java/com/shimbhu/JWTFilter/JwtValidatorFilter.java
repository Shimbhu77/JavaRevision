package com.shimbhu.JWTFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.filter.OncePerRequestFilter;

import com.shimbhu.JwtConstant.JwtConstant;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtValidatorFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String jwt = request.getHeader(JwtConstant.JWT_HEADER);
		
		
		if(jwt!=null)
		{
			try {
				
				SecretKey key = Keys.hmacShaKeyFor(JwtConstant.JWT_KEY.getBytes(StandardCharsets.UTF_8));
				
				Claims  claims = Jwts.parserBuilder().setSigningKey(key)
						          .build()
						          .parseClaimsJws(jwt)
						          .getBody();
				
				String username = String.valueOf(claims.get("username"));
				
				String authorities = String.valueOf(claims.get("authorities"));
				
				String[] auth = authorities.split("[{[=}]]");
				
				SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(auth[2]);
				
				List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
				
				grantedAuthorities.add(simpleGrantedAuthority);
				
				Authentication authentication = new UsernamePasswordAuthenticationToken(username,null,grantedAuthorities);
				
				SecurityContextHolder.getContext().setAuthentication(authentication);
				
				
				
			} catch (Exception e) {
				
				throw new UsernameNotFoundException("Invalid Token received!");
				
			}
			
			filterChain.doFilter(request, response);
		}
		
	}

	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		return request.getServletPath().equals("/masai/User/Portal");
	}
}
