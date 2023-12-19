package com.hibernate.exe2.HibernateProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		//Creating the Bike objects
		Bike b1 = new Bike();
		Bike b2 = new Bike();  
		Bike b3 = new Bike();

		//Creating the student objects
		Student s1 = new Student(11,"Ajay",25,b1);
		Student s2 = new Student(12,"Amit",23,b2);
		Student s3 = new Student(13,"Anuj",24,b3);

		//Setting the values for the Bike objects
		b1.setBikeId(001);
		b1.setBrand("Hero");
		b1.setColor("Black");
		b1.setStd(s1);

		b2.setBikeId(002);
		b2.setBrand("Honda");
		b2.setColor("Red");
		b2.setStd(s2);

		b3.setBikeId(003);
		b3.setBrand("Yamaha");
		b3.setColor("Blue");
		b3.setStd(s3);
		//Creating the object of the Configuration and calling configure method
		Configuration cfg = new Configuration().configure();
		//Building the session factory
		SessionFactory sf = cfg.buildSessionFactory();
		//Opening the session
		Session session = sf.openSession();
		//Begin the Transaction
		Transaction trans = session.beginTransaction();
		//saving the objects
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(b1);
		session.save(b2); 
		session.save(b3);
		//committing the changes that are done 
		trans.commit();   
		System.out.println("Objects of Student and Bike are created.....");
	}
}
