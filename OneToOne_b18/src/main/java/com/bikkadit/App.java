package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.entity.Address;
import com.bikkadit.entity.Employee;

/**
 * Hello world!
 *
 */
public class App{
	 public static void main( String[] args )
	    {
	    Configuration cfg=new Configuration();
	    cfg.configure("com/bikkadit/hibernate.cfg.xml");
	    SessionFactory sf= cfg.buildSessionFactory();
	    Session session =sf.openSession();
	    Transaction transaction = session.beginTransaction();
	     
	    Employee e1 =new Employee();
	    e1.setEmployeeId(01);
	    
	    Employee e2 =new Employee();
	    e2.setEmployeeId(02);
	    
	    Employee e3 =new Employee();
	    e3.setEmployeeId(03);
	    
	    Employee e4 =new Employee();
	    e4.setEmployeeId(04);
	    
	    Employee e5 =new Employee();
	    e5.setEmployeeId(05);
	    
	    Address ad1=new Address();
		ad1.setAddressId(111);
		
		Address ad2=new Address();
		ad2.setAddressId(112);
		
		Address ad3=new Address();
		ad3.setAddressId(113);
		
		Address ad4=new Address();
		ad4.setAddressId(114);
		
		Address ad5=new Address();
		ad5.setAddressId(115);
		  // Establishing relationships
        e1.setAddress(ad5);
        ad5.setEmployee(e1);

        e2.setAddress(ad4);
        ad4.setEmployee(e2);

        e3.setAddress(ad3);
        ad3.setEmployee(e3);

        e4.setAddress(ad2);
        ad2.setEmployee(e4);

        e5.setAddress(ad1);
        ad1.setEmployee(e5);

        // Persisting the objects
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);

        // Committing the transaction
        transaction.commit();

        // Closing the session and factory
        session.close();
        sf.close();
    }
}