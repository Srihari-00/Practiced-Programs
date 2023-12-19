package com.learn.crud.HibernateProject4CRUD;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
	static Configuration con = null;
	static SessionFactory factory = null;
	static Session session = null;
	static Transaction trans = null;
	static Scanner scan = null;

	static Laptop lap = null;
	static int id = 0;
	static String brand = null;
	static int cost = 0;
	public static void main( String[] args )
	{
		scan = new Scanner(System.in);

		con = new Configuration().configure();
		factory = con.buildSessionFactory();
		session = factory.openSession();
		trans = session.beginTransaction();
		System.out.println("Enter 1 for create");
		System.out.println("Enter 2 for read");
		System.out.println("Enter 3 for update");
		System.out.println("Enter 4 for delete");
		System.out.println("Enter 5 to read all values");
		int choice = scan.nextInt();
		while (true) {
			switch (choice) {
			case 1:
				createLaptop();
				break;
			case 2:
				readLaptop();
				break;
			case 3:
				updateLaptop();
				break;
			case 4:
				deleteLaptop();
				break;
			case 5:
				readAll();
				break;
			default:
				System.out.println("Invalid choice.....");
				System.exit(0);
			}
		}
	}
	private static void createLaptop()
	{
		System.out.println("Enter the total rows to be inserted");
		int rows = scan.nextInt();
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the id");
			id = scan.nextInt();
			System.out.println("Enter the brand");
			brand = scan.next();
			System.out.println("Enter the cost");
			cost = scan.nextInt();
			lap = new Laptop(id, brand, cost);
			session.save(lap);
		}
		trans.commit();
		System.out.println("Objects are saved....");
		return;


	}
	private static void readAll() 
	{
		try 
		{
			Query<Laptop> query = session.createQuery("FROM Laptop", Laptop.class);
			List<Laptop> list = query.list();
			for (Laptop lap : list) 
			{
				System.out.println(lap);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void readLaptop()
	{

		System.out.println("Enter the id to be retrieved.");
		id = scan.nextInt();
		lap = session.get(Laptop.class, id);
		trans.commit();
		System.out.println(lap);
		return;

	}
	private static void updateLaptop()
	{
		readAll();
		System.out.println("Enter the id to be updated.");
		id = scan.nextInt();
		lap = session.get(Laptop.class, id);
		if(lap!=null)
		{
			System.out.println("Enter what to be Updated");
			String choice = scan.next();
			switch(choice) {
			case "brand":
				System.out.println("Enter the new brand to update");
				String newbrand = scan.next();
				if(!newbrand.isEmpty())
				{
					lap.setBrand(newbrand);				
				}
				break;
			case "cost":
				System.out.println("Enter the new cost to update");
				int newCost = scan.nextInt();
				if(newCost!=0)
				{
					lap.setCost(newCost);
				}
				break;
			default : 
				System.out.println("Invalid choice.....");
				System.exit(0);
			}
		}
		session.saveOrUpdate(lap);
		trans.commit();
		System.out.println("Object is Updated......");
	}
	private static void deleteLaptop()
	{
		System.out.println("Enter the id to be Deleted");
		id = scan.nextInt();
		lap = session.get(Laptop.class, id);
		session.delete(lap);
		trans.commit();
		System.out.println("Object is Deleted.....");
	}
}