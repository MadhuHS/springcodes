package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeFunc()
	{
		ModelAndView m1 = new ModelAndView("Welcome");
		m1.addObject("msg","hello good morning");
		return m1;
	}

}


