package interceptors;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter
{ 
	int v1 = 5;
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception 
	{
		if(v1 == 10)
		{
	    PrintWriter w1 = response.getWriter();
	    w1.println("Site Closed for Maintainance");
		return false;
		}
		else
		{
			return true;
		}
	}

}



