package com.bikkadit;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.entity.Passport;
import com.bikkadit.entity.Person;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Configuration cfg=new Configuration();
    cfg.configure("com/bikkadit/hibernate.cfg.xml");
    SessionFactory sf= cfg.buildSessionFactory();
    Session session =sf.openSession();
    Transaction transaction = session.beginTransaction();
    
    Person p1 = new Person();
    p1.setPid(111);
    p1.setPname("virija");
    
    Person p2 = new Person();
    p2.setPid(112);
    p2.setPname("kalpana");
    
    Person p3 = new Person();
    p3.setPid(113);
    p3.setPname("madhushree");
    
    Person p4 = new Person();
    p4.setPid(114);
    p4.setPname("sujata");
    
    Person p5 = new Person();
    p5.setPid(115);
    p5.setPname("saie");
    
    Person p6 = new Person();
    p6.setPid(116);
    p6.setPname("Priyanka");
    
    Person p7 = new Person();
    p7.setPid(117);
    p7.setPname("Ashwini");
  
    Passport pp1=new Passport();
    pp1.setPassid(221);
    pp1.setPassname("aa");
    
    Passport pp2=new Passport();
    pp2.setPassid(222);
    pp2.setPassname("pp");
    
    Passport pp3=new Passport();
    pp3.setPassid(223);
    pp3.setPassname("sj");
    
    Passport pp4=new Passport();
    pp4.setPassid(224);
    pp4.setPassname("ss");
    
    Passport pp5=new Passport();
    pp5.setPassid(225);
    pp5.setPassname("mm");
    
    Passport pp6=new Passport();
    pp6.setPassid(226);
    pp6.setPassname("kk");
    
    Passport pp7=new Passport();
    pp7.setPassid(227);
    pp7.setPassname("vv");
    
    
    p1.setPassport(pp7);
    p2.setPassport(pp6);
    p3.setPassport(pp5);
    p4.setPassport(pp4);
    p5.setPassport(pp3);
    p6.setPassport(pp2);
    p7.setPassport(pp1);
    
    
    pp1.setPerson(p7);
    pp2.setPerson(p6);
    pp3.setPerson(p5);
    pp4.setPerson(p4);
    pp5.setPerson(p3);
    pp6.setPerson(p2);
    pp7.setPerson(p1);
    
   session.save(pp7);
   session.save(pp6);
   session.save(pp5);
   session.save(pp4);
   session.save(pp3);
   session.save(pp3);
   session.save(pp2);
   session.save(pp1);
   session.save(p1);
   session.save(p2);
   session.save(p3);
   session.save(p4);
   session.save(p5);
   session.save(p6);
   session.save(p7);
   
    
    transaction.commit();
   
    sf.close();
    
    
    session.close();
}
}