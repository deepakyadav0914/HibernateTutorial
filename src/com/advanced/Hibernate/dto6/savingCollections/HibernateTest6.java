package com.advanced.Hibernate.dto6.savingCollections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest6 {

	public static void main(String[] args) {
		UserDetails6 user=new UserDetails6();
		user.setUserName("dyadav");
		
		UserDetails6 user2=new UserDetails6();
		user2.setUserName("apanwar");
		
		Address6 address=new Address6();
		address.setStreet("New Colony");
		address.setCity("Palwal");
		address.setState("Haryana");
		address.setPincode("121102");
		
		Address6 address2=new Address6();
		address2.setStreet("7th Floor");
		address2.setCity("Gurgaon");
		address2.setState("Haryana");
		address2.setPincode("122002");
			
		user.getAddresses().add(address);
		user.getAddresses().add(address2);
		
		user2.getAddresses().add(address2);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		}catch(Exception e){e.printStackTrace();}
		finally{
			sessionFactory.close();
		}
	}
}
