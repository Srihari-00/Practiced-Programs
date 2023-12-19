package com.practice.employee;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name1: ");
		String name1=sc.next();
		System.out.println("Enter  the salary1: ");
		double salary1=sc.nextDouble();

		Manager manager = new Manager(name1,salary1);
		System.out.println("Enter the name2: ");
		String name2=sc.next();
		System.out.println("Enter the salary2: ");
		double salary2=sc.nextDouble();
		Developer developer = new Developer(name2,salary2);

		System.out.println("Manager Details:");

		manager.displayDetails();

		System.out.println("\nDeveloper Details:");

		developer.displayDetails();

	}
}