package com.learn.comparatorinterface;

import java.util.*;

import com.learn.comparableinterface.Student1;

public class StudentApp {

	public static void main(String[] args) 
	{
		Student1 s1 = new Student1(122, "Hari", 55.9F);
		Student1 s2 = new Student1(17, "Satwika", 99.5F);
		Student1 s3 = new Student1(12, "Ram", 78.2F);
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Before sorting ");
		System.out.println(al);
		System.out.println("After Sorting ");
		Collections.sort(al);
		System.out.println(al);
	}
}
