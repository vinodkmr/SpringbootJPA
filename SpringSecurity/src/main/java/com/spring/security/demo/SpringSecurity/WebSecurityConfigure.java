package com.spring.security.demo.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {
	
	 @Autowired
	 CustomAuthentication customauthentication;
	  
	  @Autowired
	  public void configure(AuthenticationManagerBuilder auth) throws Exception {    
	 	 auth.authenticationProvider(customauthentication);
	  } 
	 

	  @Override
	  protected void configure(HttpSecurity http) throws Exception {

	 	//CSRF DISABLED
	 	http.csrf().disable();
	 	
	 	
	 	//Login and logout is permitted for all users
	 	http.authorizeRequests().antMatchers("/","/spring-security/login").permitAll();

	 	//Login and logout configurations
	 	http.authorizeRequests()
	 		.and().formLogin().
	 			loginProcessingUrl("/spring-security/login").loginPage("/spring-security/login").
	 			defaultSuccessUrl("/spring-security/welcome")
	 			.failureUrl("/spring-security/login?error=true").usernameParameter("username").passwordParameter("password").
	 		and().logout()
	 		.logoutUrl("/spring-security/logout").logoutSuccessUrl("/spring-security/login?logout");

	 	
	 	 // If no login, it will redirect to /login page.
	 	http.authorizeRequests().antMatchers("/**").authenticated();
	 	
	 	//Handling Access Denied Request
	 	http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/spring-security/accessdenied");
	 	

	  }

}
