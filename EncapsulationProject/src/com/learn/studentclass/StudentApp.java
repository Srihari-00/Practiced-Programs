package com.learn.studentclass;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Students : ");
		int num=scan.nextInt();
		
		Student s = new Student();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the Student "+(i+1)+" rollNo:");
			int rollNo=scan.nextInt();
			System.out.println("Enter the Student "+(i+1)+" name:");
			String name=scan.next();
			System.out.println("Enter the Student "+(i+1)+" age:");
			int age = scan.nextInt();
			System.out.println("Enter the Student "+(i+1)+" Percentage:");
			float percentage = scan.nextFloat();
			//Calling the setter method
			s.setData(rollNo, name, age, percentage);
			//Calling the Getter method
			System.out.println("The details of the student "+(i+1)+" is : ");
			System.out.println("The rollNo of the student"+(i+1)+" : "+s.getrollNo());
			System.out.println("The name of the student "+(i+1)+": "+s.getName());
			System.out.println("The age of the student "+(i+1)+": "+s.getAge());
			System.out.println("The percentage of the student "+(i+1)+": " +s.getPercentage());
		}

	}

}
