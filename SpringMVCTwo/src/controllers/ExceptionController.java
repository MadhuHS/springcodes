package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class ExceptionController 
{
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ModelAndView handleException() {
		ModelAndView m1 = new ModelAndView("Exception");
		System.out.println("handler");
		m1.addObject("status",HttpStatus.INTERNAL_SERVER_ERROR);
		return m1;
	}

}



