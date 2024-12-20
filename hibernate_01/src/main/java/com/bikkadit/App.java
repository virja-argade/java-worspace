package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.entity.Employee;
import com.bikkadit.entity.address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("com/bikkadit/hibernate.cfg.xml");
         SessionFactory sf=cfg.buildSessionFactory();
         Session session = sf.openSession();
         Transaction tx =session.beginTransaction();
         address a =new address();
         a.setCity("Nashik");
         a.setState("MH");
         a.setZip("87879");
         
         Employee e = new Employee();
         e.setName("ram");
          e.setEmail("ram@gmail.com");
         e.setSalary(100000);
         e.setAddress(a);
         session.save(e);
         
         session.close();
    }
}
