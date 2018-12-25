package com.jspiders.pkg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setName("Smith");

		Order od1 = new Order();
		od1.setQty("2");

		SessionFactory sf1 = new Configuration()
				                 .configure()
				                 .buildSessionFactory();
		Session s1 = sf1.openSession();

		Transaction tx = s1.getTransaction();
		tx.begin();

		s1.save(c1);
		s1.save(od1);

		tx.commit();

		s1.close();

	}

}
