package com.kodnest.examples;

public class ComparisionExample5 {

	public static void main(String[] args) 
	{
		String s1 = "JAVA";
		String s2 = "SQL";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
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
