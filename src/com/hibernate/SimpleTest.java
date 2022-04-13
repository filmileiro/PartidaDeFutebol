package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Student student = new Student();
        student.setId(1);
        student.setName("Ze Mane");
        student.setRoll("101");
        student.setPhone("9999");
        student.setDegree("B.E");

        Transaction tx = session.beginTransaction();
        session.save(student);
        System.out.println("Objeto salvo com successo.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
}

