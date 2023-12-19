package armstrongNumbers;

import java.util.Scanner;

public class ArmstorngNumberApp {

	public static void main(String[] args)
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();//accepting the user input
		//creating the object of another class
		ArmstrongNumber pr = new ArmstrongNumber();
		//calling the method using the object of another class
		pr.checkArmstrongNumber(num);

	}

}
