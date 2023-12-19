package com.kodnest.examples;

public class ComparisionExample4 {

	public static void main(String[] args) 
	{
		String s1 = "JAVA";
		String s2 = "SQL";
		String s3 = "JAVA"+"SQL";
		String s4 = "JAVA"+"SQL";
		
		if(s3 == s4)
		{
			System.out.println("The References are equal ");
		}
		else
		{
			System.out.println("The References are not equal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("The String values are equal");
		}
		else
		{
			System.out.println("The String values are not equal");
		}
	}

}
