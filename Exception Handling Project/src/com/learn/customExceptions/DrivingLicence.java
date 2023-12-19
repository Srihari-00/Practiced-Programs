package com.learn.customExceptions;

import java.util.Scanner;

public class DrivingLicence {

	public static void main(String[] args) 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = scan.nextInt();
			applyDL(age);
		}
		catch(Exception e)
		{
			System.out.println("Custom exception is handled");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	public static void applyDL(int age) throws Exception
	{
		if(age>=18 && age<=65)
		{
			System.out.println("You have applied for DL");
		}
		else if(age<18)
		{
			throw new UnderAgeException();
		}
		else if(age>65)
		{
			throw new OverAgeException();
		}
	}

}
