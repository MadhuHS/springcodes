package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController 
{
   @RequestMapping("/signup")
   public String giveSignupPage()
   {
	 return "Signup";  
   }
   
   @RequestMapping(value = "/trysignup",method = RequestMethod.POST)
   public void trySignup(@RequestParam String name,
		                 @RequestParam String email,
		                 @RequestParam  Long phone)
   {
	   System.out.println(name);
	   System.out.println(email);
	   System.out.println(phone);
   }
}





