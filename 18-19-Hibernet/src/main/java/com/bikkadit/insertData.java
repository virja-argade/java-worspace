package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bikkadit.entity.Passenger;

public class insertData {
	private static Session session;
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
        cfg.configure("com/bikkadit/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		session = sf.openSession();
		Transaction tx = session.beginTransaction();
	    Passenger p =new Passenger( "ziya", "nashik","35","995636346");
	    Passenger p1 = new Passenger( "ram", "Mumbai", "30", "9988776655");
        Passenger p2 = new Passenger("nita", "Pune", "25", "8877665544");
        Passenger p3 = new Passenger("shyam", "Delhi", "28", "7766554433");
        Passenger p4 = new Passenger("radha","amravati","27","99845743744");
        // Save each Passenger object
        session.save(p1);
        session.save(p2);
        session.save(p3);        
	    session.save(p4);
		session.save(p);
		tx.commit();
		session .close();
		sf.close();
		System.out.println("Data insterted successfully !!!!!!");

	}

}
