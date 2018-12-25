package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dbopertions.UserDBOpts;
import models.Address;
import models.User;

@Controller
public class SignupController {
	@RequestMapping("/signup")
	public String giveSignupPage() {
		return "Signup";
	}

	/*
	 * @RequestMapping(value = "/trysignup", method = RequestMethod.POST) public
	 * void trySignUp(@RequestParam String name,
	 * 
	 * @RequestParam String email,
	 * 
	 * @RequestParam Long phone) { System.out.println(name);
	 * System.out.println(email); System.out.println(phone); }
	 */

	
	 @RequestMapping(value = "/trysignup", method = RequestMethod.POST) 
	 public ModelAndView trySignUp(@ModelAttribute User user) 
	 { 
		ModelAndView m1 = new ModelAndView("UserProfile");
		UserDBOpts u1 = new UserDBOpts();
		u1.addUser(user);
		m1.addObject("user", user);
		return m1;
	 }
	 
	 
	 
	 
}






