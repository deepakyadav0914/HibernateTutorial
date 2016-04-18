package com.advanced.Hibernate.dto4.valueTypesEmbedObjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest4 {

	public static void main(String[] args) {
		UserDetails4 user=new UserDetails4();
		user.setUserName("dyadav");
		
		Address4 address=new Address4();
		address.setStreet("New Colony");
		address.setCity("Palwal");
		address.setState("Haryana");
		address.setPincode("121102");
			
		user.setAddress(address);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		}catch(Exception e){e.printStackTrace();}
		finally{
			sessionFactory.close();
		}
	}
}
