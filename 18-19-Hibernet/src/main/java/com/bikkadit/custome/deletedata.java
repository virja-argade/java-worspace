package com.bikkadit.custome;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class deletedata {

public static void main(String[]args) {
      Configuration cfg = new Configuration();
      cfg.configure("com/bikkadit/hibernate.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();
    String hql = "delete from Passenger where city = :city";
    Query query = session.createQuery(hql);
    query.setParameter(0, args);
    tx.commit();
    session.close();
    
}
    
}
