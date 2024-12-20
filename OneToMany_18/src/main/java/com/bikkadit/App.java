package com.bikkadit;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.entity.City;
import com.bikkadit.entity.Country;



public class App {
    public static void main(String[] args) {
        // Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("com/bikkadit/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // Creating Country objects
        Country c1 = new Country();
        c1.setCid(11);
        c1.setCityName("INDIA");

        Country c2 = new Country();
        c2.setCid(12);
        c2.setCityName("JAPAN");

        // Creating City objects
        City cc1 = new City();
        cc1.setCityId(1111);
        cc1.setCityName("Mumbai");

        City cc2 = new City();
        cc2.setCityId(2222);
        cc2.setCityName("New York");

        City cc3 = new City();
        cc3.setCityId(2222);
        cc3.setCityName("Washington DC");

        City cc4 = new City();
        cc4.setCityId(11111);
        cc4.setCityName("Bangalore");

        // Adding cities to countries
        ArrayList<City> l1 = new ArrayList<>();
        l1.add(cc1);
        l1.add(cc4);

        ArrayList<City> l2 = new ArrayList<>();
        l2.add(cc2);
        l2.add(cc3);

        // Setting cities to countries
        c1.setCities(l1);  // Associate l1 with c1
        c2.setCities(l2);  // Associate l2 with c2

        // Setting countries to cities
        cc1.setCountry(c1);
        cc4.setCountry(c1);
        cc2.setCountry(c2);
        cc3.setCountry(c2);

        // Saving countries (cascade saves cities)
        session.save(c1);
        session.save(c2);

        // Committing the transaction
        transaction.commit();

        // Closing resources
        session.close();
        sf.close();
    }
}
