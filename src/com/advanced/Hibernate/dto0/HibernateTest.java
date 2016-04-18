package com.advanced.Hibernate.dto0;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("User965");	
		
		SessionFactory sessionFactory = null;
		Session session=null;
		try{
		//Once per Project
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		}
		finally{
			sessionFactory.close();
		}
	}
}
