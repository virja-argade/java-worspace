package com.bikkadit.custome;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class insert {
    public static void main(String[]args) {
    	
    Configuration cfg=new Configuration	();
    cfg.configure("com/bikkadit/hibernate.cfg.xml");
    
    SessionFactory sf=cfg.buildSessionFactory();
    Session session=sf.openSession();
    Transaction tx = session.beginTransaction();
    String hql = "INSERT INTO Employee (psid, name, city, age, mob) VALUES (:psid, :name, :city, :age, :mob)";
     Query query = session.createQuery(hql);
     query.setParameter("psid",201);
     query.setParameter("name", "virija");
     query.setParameter("city","hydrabad" );
     query.setParameter("age", 30);
     query.setParameter("mob", "9699015590");
     int excuteUpdate=query.executeUpdate();
     System.out.println(excuteUpdate);
     session.close();
  
    	
    }
}
