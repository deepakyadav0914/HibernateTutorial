package com.advanced.Hibernate.dto1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest1 {

	public static void main(String[] args) {
		UserDetails1 user=new UserDetails1();
		user.setUserId(19);
		user.setUserName("User gf");
		user.setCreatedDate(new Date());
		user.setAddress("285 R New Colony");
		user.setDescription("This guy is into Automation, He is senior test engineer, works in a reputed software company,"
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company, "
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company"
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company, "
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company"
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company, "
				+ "This guy is into Automation, He is senior test engineer, works in a reputed software company");
		
		SessionFactory sessionFactory = null;
		Session session=null;
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			sessionFactory.close();
		}
	}
}
