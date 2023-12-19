package com.learn.gcd;

import java.util.Scanner;

public class GCDofTwoNumbersApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		GCDofTwoNumbers pr = new GCDofTwoNumbers();
		
		System.out.println("The GCD of "+num1+" and "+num2+" is "+pr.printGCD(num1,num2));

	}

}
