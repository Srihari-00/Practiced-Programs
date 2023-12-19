package gcdoftwoNumbers;

import java.util.Scanner;

public class GcdofTwonumbersApp {

	public static void main(String[] args)
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		//accepting the two numbers as input from the user
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		//creating the object of another class
		GcdofTwonumbers pr = new GcdofTwonumbers();
		//calling the method using the object of another class
		pr.calculateGCDofTwonumbers(num1, num2);

	}

}
