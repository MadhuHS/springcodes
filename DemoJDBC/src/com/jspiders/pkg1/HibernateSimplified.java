package com.jspiders.pkg1;

import java.util.HashSet;

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
		
		User u1 = new User();			
		u1.setName("Hibernate user");
		
		Address work = new Address();
		work.setCity("blr");
		work.setState("kar");
		work.setPincode(5600018);
		
		Address home = new Address();
		home.setCity("mys");
		home.setState("kar");
		home.setPincode(571332);
		
		HashSet<Address> addrSet = new HashSet<Address>();
		addrSet.add(work);
		addrSet.add(home);
		addrSet.add(work);
		
		u1.setAddrSet(addrSet);
		
	    s1.save(u1);
		tx.commit();
	    s1.close();

	}
}





