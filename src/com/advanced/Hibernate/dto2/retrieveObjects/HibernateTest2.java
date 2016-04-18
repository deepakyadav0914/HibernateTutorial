package com.advanced.Hibernate.dto2.retrieveObjects;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest2 {

	public static void main(String[] args) {
		UserDetails2 user=new UserDetails2();
		user.setUserId(1);
		user.setUserName("dyadav");
		user.setCreatedDate(new Date());
		user.setAddress("285 R New Colony");
		user.setDescription("This guy is into Automation, He is senior test engineer, works in a reputed software company");
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
				
		user=null;
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails2)session.get(UserDetails2.class, 1);
		System.out.println("Username retrieved is "+user.getUserName());
		}catch(Exception e){e.printStackTrace();}
		finally{
			sessionFactory.close();
		}
	}
}
