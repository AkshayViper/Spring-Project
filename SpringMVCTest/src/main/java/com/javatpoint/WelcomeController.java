package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("name")    //For setting Scope Session in the spring
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView mymethod(){
		
		ModelAndView mw = new ModelAndView();
		mw.setViewName("welcomepage");
		mw.addObject("name", "Akshay Pant");
		return mw;
	}
}
