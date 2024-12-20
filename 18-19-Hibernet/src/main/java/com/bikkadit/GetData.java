package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.entity.Passenger;



public class GetData {
	 public static void main(String[] args) {
	       
	        Configuration cfg = new Configuration();
	        cfg.configure("com/bikkadit/hibernate.cfg.xml");
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        Passenger passenger = session.get(Passenger.class,1);
	        System.out.println(passenger);
	        
	        
	        transaction.commit();
	        
	        
	        session.close();

	        
	        sessionFactory.close();
	    }
	}
