package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {
	@RequestMapping("/signup")
	public String giveSignupPage() {
		return "Signup";
	}

	@RequestMapping(value = "/trysignup", method = RequestMethod.POST)
	public ModelAndView trySignUp(@RequestParam String name,
			                      @RequestParam String email, 
			                      @RequestParam Long phone) {
		ModelAndView m1 = new ModelAndView("UserProfileView");
		m1.addObject("name", name);
		m1.addObject("email", email);
		m1.addObject("phone", phone);
		return m1;
	}
}
