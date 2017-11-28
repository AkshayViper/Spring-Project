package com.springdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.Service.LoginService;

@Controller
@RequestMapping(value="/")
public class LoginController {
	
	@Autowired
	public LoginService loginService;
	@RequestMapping(value="login")
	public ModelAndView GetLogin()
	{
		
		System.out.println("Welcome Boss");
		String message = loginService.getLogin();
		return new ModelAndView("login","message", message);
		
	}
	
	@RequestMapping(value="logout")
	public ModelAndView GetLogout()
	{
		System.out.println("Bye Boss");
		return new ModelAndView("index");
		
	}
}
