package com.kodnest.examples;

public class ComparisionExample1 {

	public static void main(String[] args)
	{
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		if(s1 == s2)
		{
			System.out.println("The References are equal ");
		}
		else
		{
			System.out.println("The References are not equal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("The String values are equal");
		}
		else
		{
			System.out.println("The String values are not equal");
		}
		
	}

}
