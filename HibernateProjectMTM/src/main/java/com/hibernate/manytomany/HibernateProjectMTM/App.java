package com.hibernate.manytomany.HibernateProjectMTM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
	public static void main(String[] args)
	{
		//Creating the lists of Employee type for Technology Entity
		List<Employee> emplst1 = new ArrayList<Employee>();
		List<Employee> emplst2 = new ArrayList<Employee>();
		List<Employee> emplst3 = new ArrayList<Employee>();
		List<Employee> emplst4 = new ArrayList<Employee>();
		//Creating lists of Technology for Employee Entity 
		List<Technology> techlst1 = new ArrayList<Technology>();
		List<Technology> techlst2 = new ArrayList<Technology>();
		List<Technology> techlst3 = new ArrayList<Technology>();
		List<Technology> techlst4 = new ArrayList<Technology>();
		List<Technology> techlst5 = new ArrayList<Technology>();
		//Creating the objects of the Employee
		Employee e1 = new Employee(11,"Prakash","Team-A",techlst1);
		Employee e2 = new Employee(12,"Praveen","Team-B",techlst2);
		Employee e3 = new Employee(13,"Pooja","Team-c",techlst3);
		Employee e4 = new Employee(14,"Priya","Team-A",techlst4);
		Employee e5 = new Employee(15,"Prateek","Team-B",techlst5);
		//Creating the objects of the Technology
		Technology t1 = new Technology(123,"Java",emplst1);
		Technology t2 = new Technology(124,"MySQL",emplst2);
		Technology t3 = new Technology(125,"Python",emplst3);
		Technology t4 = new Technology(126,"React",emplst4);
		//For T_id=123
		emplst1.add(e1);
		emplst1.add(e3);
		emplst1.add(e5);
		//for T_id=124
		emplst2.add(e1);
		emplst2.add(e2);
		emplst2.add(e4);
		emplst2.add(e5);
		//for T_id=125
		emplst3.add(e2);
		emplst3.add(e4);
		emplst3.add(e5);
		//for T_id=126
		emplst4.add(e1);
		emplst4.add(e2);
		emplst4.add(e3);
		emplst4.add(e4);
		emplst4.add(e5);
		//Technology lists
		//for E_id = 11
		techlst1.add(t1);
		techlst1.add(t2);
		techlst1.add(t4);
		//for E_id = 12
		techlst2.add(t2);
		techlst2.add(t3);
		techlst2.add(t4);
		//for E_id = 13
		techlst3.add(t1);
		techlst3.add(t4);
		//for E_id = 14
		techlst4.add(t2);
		techlst4.add(t3);
		techlst4.add(t4);
		//for E_id = 15
		techlst5.add(t1);
		techlst5.add(t2);
		techlst5.add(t3);
		techlst5.add(t4);
		//Creating the configuration and calling the configure method
		Configuration con = new Configuration().configure();
		//Creating the sessionFactory
		SessionFactory sf = con.buildSessionFactory();
		//Creating the Session
		Session session = sf.openSession();
		//Creating the Transaction
		Transaction trans = session.beginTransaction();
		//Saving the Employee Objects
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		//Saving the Technology Objects
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		//Committing the changes that are made
		trans.commit();
		System.out.println("Objects are created........");
	}
}
