package com.jspiders.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBhelper 
{
	public static String dbUrl = "jdbc:mysql://localhost:3306/hibernatedb";

	public static Connection getDbConnection(String username,String pwd) throws SQLException
	{
		Connection con = DriverManager.getConnection(dbUrl,username,pwd);
		return con;
	}
}
