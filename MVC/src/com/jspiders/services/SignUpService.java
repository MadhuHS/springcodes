package com.jspiders.services;

import com.jspiders.models.User;

public class SignUpService 
{
   public boolean trySignup(User usr)
   {
	   if(usr.getName().length() !=0 && usr.getEmail().length() !=0)
	   {
	     System.out.println("User signup done");
	     return true;
	   }
	   else
	   {
		   return false;
	   }
   }
}
