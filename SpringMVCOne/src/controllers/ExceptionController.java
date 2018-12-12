package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ExceptionController 
{
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleException() {
		ModelAndView m1 = new ModelAndView("Exception");
		m1.addObject("status",HttpStatus.INTERNAL_SERVER_ERROR);
		return m1;
	}

}



