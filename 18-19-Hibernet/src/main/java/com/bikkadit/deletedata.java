package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bikkadit.entity.Passenger;

public class deletedata {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/bikkadit/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Passenger passenger = session.get(Passenger.class, 111);
		System.out.println(passenger);
		session.delete(passenger);
		tx.commit();
		session.close();

	}
}