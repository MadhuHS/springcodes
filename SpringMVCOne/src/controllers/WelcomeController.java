package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class WelcomeController {

	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping("/")
	public String welcomeFunc() {
	
		return "Welcome";
	}



}
