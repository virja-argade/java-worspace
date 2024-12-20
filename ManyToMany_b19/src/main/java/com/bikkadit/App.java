package com.bikkadit;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bikkadit.entity.Bank;
import com.bikkadit.entity.Custemer;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("com/bikkadit/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Creating Bank objects
        Bank b1 = new Bank();
        b1.setBId(2222);
        b1.setBname("HDFC");

        Bank b2 = new Bank();
        b2.setBId(4444);
        b2.setBname("SBI");

        Bank b3 = new Bank();
        b3.setBId(8888);
        b3.setBname("ICICI");

        // Creating Customer objects
        Custemer c1 = new Custemer();
        c1.setCId(1);
        c1.setCname("Virija");

        Custemer c2 = new Custemer();
        c2.setCId(2);
        c2.setCname("Pratik");

        // Creating Lists
        List<Bank> banks = new ArrayList<>();
        banks.add(b1);
        banks.add(b2);
        banks.add(b3);

        List<Custemer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        // Setting Relationships
        b1.setCustemer(customers);
        b2.setCustemer(customers);
        b3.setCustemer(customers);

        c1.setBank(banks);
        c2.setBank(banks);

        // Persisting Entities
        session.save(b1);
        session.save(b2);
        session.save(b3);
        session.save(c1);
        session.save(c2);

        // Committing Transaction
        tx.commit();

        // Closing Session
        session.close();
        sf.close();
    }

}
