package com.learn.employee;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Employee e = new Employee();
		
		/*Errors occured due to tried to access the private data members without using the public setter and
		 * public getter methods. 
		 * e.name = "Srihari";
			e.id=12;
			e.salary = 45000;*/
		//e.setData(13, "SRIHARI", 1514000);
		System.out.println("Enter the id");
		int id=scan.nextInt();
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter the salary");
		int salary = scan.nextInt();
		
		e.setData(id, name, salary);
		System.out.println("Employee Id is : "+e.getId());
		System.out.println("Employee name is : "+e.getName());
		System.out.println("Employee salary is : "+e.getSalary());

	}

}
