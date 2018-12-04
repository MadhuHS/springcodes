package com.jspiders.pkg1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass 
{
	public static void main(String[] args)
	{
       ClassPathXmlApplicationContext c1 = 
    		   new ClassPathXmlApplicationContext("spring.xml");
       
      Employee e1 = (Employee) c1.getBean("emp");
      List a1 = e1.getAllAddress();
      for(Object obj : a1)
      {
    	   System.out.println(obj);
      }
      
	}
}






