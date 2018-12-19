package com.jspiders.pkg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSimplified 
{
	public static void main(String[] args) 
	{		
		SessionFactory sf1 = new Configuration()
				           .configure()
				           .buildSessionFactory();
	    	Session s1 =	 sf1.openSession();
		
		Transaction tx = s1.getTransaction();
		tx.begin();
		
		for (int i = 1; i <= 5; i++) 
		{
			User u1 = new User();
			u1.setId(i);
			u1.setName("Hibernate user "+i);
			u1.setBio("bio "+i);
			s1.save(u1);
		}
		
		tx.commit();
		s1.close();
		
		s1 = null;
		
		s1 = sf1.openSession();
		
		tx = s1.getTransaction();
		tx.begin();
		
		
		for (int i = 1; i <= 5; i++)
		{
			User us1 = s1.get(User.class,i);
			System.out.println(us1.getName());
			System.out.println(us1.getId());
			System.out.println(us1.getBio());
		}
		
		
		
		tx.commit();
	    s1.close();
		
		
		
	}
}





