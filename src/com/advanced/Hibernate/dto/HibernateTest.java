package com.advanced.Hibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		TestCases tc=new TestCases();
		tc.setComponent("cd");
		tc.setRequest("request");
		tc.setRequest_type("request_type");
		tc.setResponse("response");
		tc.setScenario("scenario");
		tc.setStatus_code("200");
		
		/*
		Reports rep=new Reports();
		rep.setBuild("build");
		rep.setPath("path");
		rep.setStatus("status");
		rep.setWorkflowname("workflowname");
	
		
		ResultTestCases rst=new ResultTestCases();
		rst.setActual_response("actual_response");
		rst.setActual_response_code("actual_response_code");
		rst.setStatus("status");
		rst.setTestcaseid("testcaseid");
		rst.setWorkflowid_fk("khjg");
		rep.setWorkflowid(86);*/
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(tc);
		
		session.getTransaction().commit();
		}catch(Exception e){e.printStackTrace();}
		finally{
			session.close();
			sessionFactory.close();
		}
	}
}
