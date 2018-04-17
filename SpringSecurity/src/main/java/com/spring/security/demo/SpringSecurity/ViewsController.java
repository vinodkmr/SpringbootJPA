package com.spring.security.demo.SpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring-security")
public class ViewsController {

@RequestMapping("/login")
public String showLogin(String logout,Model model){
	if(logout!=null){
		model.addAttribute("logoutmsg","You've been successfully logged out");
	}
	return "customlogin";
}
	
@RequestMapping("/welcome")
public String showWelcome(){
	return "welcome";
}
}
