package com.kodnest.examples;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) 
	{
		String s1 = "JAVA";//Initializing 
		System.out.println(s1);
		String s2 = s1.concat("TECH");
		System.out.println(s1);
		System.out.println(s2);
		String s3 = "JAVATECH";
		if(s2==s3)
		{
			System.out.println("S2 is inside the string pool");
		}
		else
		{
			System.out.println("S2 is outside the string pool");
		}
		
	}
	

}
