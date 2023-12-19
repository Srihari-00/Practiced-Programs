package powerraisedtoN;

import java.util.Scanner;

public class PowerraisedtoNApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num1=scan.nextInt();//accepting the input from the user
		System.out.println("Enter the Power : ");
		int num2=scan.nextInt();
		//creating the object of another class
		NumberraisedtoPowerN pr = new NumberraisedtoPowerN();
		//calling the method by using the object of another class
		pr.calculatetheNumberPowerToN(num1, num2);

	}

}
