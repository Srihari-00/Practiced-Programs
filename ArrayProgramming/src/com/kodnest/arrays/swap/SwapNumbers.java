package com.kodnest.arrays.swap;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		//Taking the numbers as input from the user
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		//Displaying the numbers
		System.out.println("The numbers before swap : "+num1+"  "+num2);
		int temp=0;
		//Swapping operation
		temp=num1;
		num1=num2;
		num2=temp;
		//displaying the numbers after swapped
		System.out.println("TH numbers after swap : "+num1+" "+num2);


	}

}
