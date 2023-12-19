package SumBecomesaSingleDigit;

import java.util.Scanner;

public class SumofDiDigitsbecomeSingleDigitApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();//accepting the user input
		//creating an object of another class
		SumofDigitsBecomeSingleDigit pr = new SumofDigitsBecomeSingleDigit();
		//calling the method of another class using its object
		pr.calculateTheSumuntilSingleDigit(num);

	}

}
