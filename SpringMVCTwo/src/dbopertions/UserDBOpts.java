package dbopertions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.User;

public class UserDBOpts 
{
	static SessionFactory sf1 = null;
	static Session s1 = null;
	static Transaction tx = null;
	
	static
	{
		sf1 = new Configuration().configure().buildSessionFactory();
		s1 = sf1.openSession();

		tx = s1.getTransaction();
	}

	// Create
	public static void addUser(User u1) {
		tx.begin();
		s1.save(u1);
		tx.commit();
		System.out.println("User added");
	}

	// Read
	public static void showUserDetails(int id) {
		tx.begin();
		User u1 = s1.get(User.class, id);
		System.out.println("Name : " + u1.getName());
		System.out.println("Id   : " + u1.getId());
		tx.commit();
	}

	// Update
	public static void updateUser(String newName, int id) {
		tx.begin();
		User u1 = s1.get(User.class, id);
		u1.setName(newName);
		s1.update(u1);
		System.out.println("User Name Updated");
		tx.commit();
	}

	//Delete
	public static void deleteUser(int id) {
		tx.begin();
		User u1 = s1.get(User.class, id);
		s1.delete(u1);
		System.out.println("User with "+id+" deleted");
		tx.commit();
	}
}
