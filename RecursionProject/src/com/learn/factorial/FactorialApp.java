package com.learn.factorial;

import java.util.Scanner;

public class FactorialApp 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		System.out.println(Factorial.fact(num));
	}

}
