package com.hibernate.exe1.HibernateProject1;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        Student st = new Student(13,"Jay",22);
        session.save(st);
        trans.commit();
        System.out.println("Student object");
    }
}
