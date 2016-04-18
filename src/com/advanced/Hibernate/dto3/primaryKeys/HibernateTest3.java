package com.advanced.Hibernate.dto3.primaryKeys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest3 {

	public static void main(String[] args) {
		UserDetails3 user=new UserDetails3();
		user.setUserName("dyadav");
		UserDetails3 user2=new UserDetails3();
		user2.setUserName("apanwar");
		
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
