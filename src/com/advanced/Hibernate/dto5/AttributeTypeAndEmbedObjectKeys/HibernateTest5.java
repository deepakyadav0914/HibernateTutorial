package com.advanced.Hibernate.dto5.AttributeTypeAndEmbedObjectKeys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest5 {

	public static void main(String[] args) {
		UserDetails5 user=new UserDetails5();
		user.setUserName("dyadav");
		
		Address5 homeAddress=new Address5();
		homeAddress.setStreet("New Colony");
		homeAddress.setCity("Palwal");
		homeAddress.setState("Haryana");
		homeAddress.setPincode("121102");
		
		Address5 officeAddress=new Address5();
		officeAddress.setStreet("Vanijya Kunj");
		officeAddress.setCity("Gurgaon");
		officeAddress.setState("Haryana");
		officeAddress.setPincode("122002");
		
			
		user.setHomeAddress(homeAddress);
		user.setOfficeAddress(officeAddress);
		
		
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
