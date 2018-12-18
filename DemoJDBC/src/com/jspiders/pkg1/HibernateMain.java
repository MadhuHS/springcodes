package com.jspiders.pkg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain 
{
	public static void main(String[] args) 
	{		
		Configuration cfg = new Configuration();
		
		Configuration cfg2 = cfg.configure();
		SessionFactory sftry =  cfg2.buildSessionFactory();
		
		Session s1 = sftry.openSession();
		s1.beginTransaction();
		User u1 = new User();
		u1.setId(100);
		u1.setName("Hibernate user");
		s1.save(u1);
		s1.getTransaction().commit();
		
	}
}




