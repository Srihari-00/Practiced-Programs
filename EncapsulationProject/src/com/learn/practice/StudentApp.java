package com.learn.practice;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//Student 1
		String n1=scan.next();
		int a1=scan.nextInt();
		int m1=scan.nextInt();
		String g1=scan.next();
		//Student 2
		String n2=scan.next();
		String g2=scan.next();	
		int a2=scan.nextInt();
		int m2=scan.nextInt();
		//Constructor Student 1
		Student s1=new Student(n1,a1,g1,m1);
		System.out.println("Student 1: ");
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Gender: "+s1.getGender());
		System.out.println("Marks: "+s1.getMarks());
		//Constructor Student 2
		Student s2=new Student(n2,a2,g2,m2);
		System.out.println("Student 2: ");
		System.out.println("Name: "+s2.getName());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Gender: "+s2.getGender());
		System.out.println("Marks: "+s2.getMarks());
	}

}
