package com.advanced.Hibernate.dto7.confCollectionsAddKeys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest7 {

	public static void main(String[] args) {
		UserDetails7 user=new UserDetails7();
		user.setUserName("dyadav");
		
		UserDetails7 user2=new UserDetails7();
		user2.setUserName("apanwar");
		
		Address7 address=new Address7();
		address.setStreet("New Colony");
		address.setCity("Palwal");
		address.setState("Haryana");
		address.setPincode("121102");
		
		Address7 address2=new Address7();
		address2.setStreet("7th Floor");
		address2.setCity("Gurgaon");
		address2.setState("Haryana");
		address2.setPincode("122002");
			
		user.getListofAddresses().add(address);
		user.getListofAddresses().add(address2);
		
		user2.getListofAddresses().add(address2);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		}catch(Exception e){e.printStackTrace();}
		finally{
			session.close();
			sessionFactory.close();
		}
	}
}
