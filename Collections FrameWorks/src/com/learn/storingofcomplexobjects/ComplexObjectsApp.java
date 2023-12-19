package com.learn.storingofcomplexobjects;

import java.util.ArrayList;

public class ComplexObjectsApp {

	public static void main(String[] args) 
	{
		Student s1 = new Student(11, "Hari", 55.9F);
		Student s2 = new Student(15, "Satwika", 99.5F);
		Student s3 = new Student(12, "Ram", 78.2F);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
	}

}
