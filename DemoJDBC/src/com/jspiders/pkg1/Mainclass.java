package com.jspiders.pkg1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Mainclass
{
	public static boolean addUser(User usr) throws SQLException
	{
	  	Connection con = DBhelper.getDbConnection("root","Root$123");
	  	Statement s1 =  con.createStatement();
	  	String name = usr.getName();
	  	int    id   = usr.getId();
	  	
	  	String updateQuery = "insert into hibernatedb.user values ("+id+","+"'"+name+"'"+")";
	  	int res = s1.executeUpdate(updateQuery);
	  	if(res != 0)
	  	{
	  		return true;
	  	}
	  	else
	  	{
	  		return false;
	  	}
	  	
	}
	public static void main(String[] args) throws SQLException
	{
       User u1 = new User();
       u1.setId(2);
       u1.setName("User One");
       boolean b1 = addUser(u1);
       if(b1 == true)
       {
    	     System.out.println("added");
       }
       else
       {
    	     System.out.println("not added");
       }
	}
}



