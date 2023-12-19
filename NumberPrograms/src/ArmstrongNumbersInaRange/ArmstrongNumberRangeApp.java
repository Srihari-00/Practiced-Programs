package ArmstrongNumbersInaRange;

import java.util.Scanner;

public class ArmstrongNumberRangeApp {

	public static void main(String[] args)
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();//accepting the input from the user
		//creating the object of another class
		ArmstrongNumbersRange pr = new ArmstrongNumbersRange();
		//Calling a method of another class by its object
		pr.displayAllArmstrongNumbers(num);

	}

}
