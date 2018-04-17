package com.spring.security.demo.SpringSecurity;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Configuration
public class CustomAuthentication implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		String username = auth.getName();
		String password = auth.getCredentials().toString();
		if((!username.equalsIgnoreCase("admin"))||(!password.equals("password"))){
			throw new BadCredentialsException("Invalid username or password!!");
		}
		
			return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
		
		
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
