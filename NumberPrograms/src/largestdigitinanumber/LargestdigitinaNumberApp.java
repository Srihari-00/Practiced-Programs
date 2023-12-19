package largestdigitinanumber;

import java.util.Scanner;

public class LargestdigitinaNumberApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();//accepting the input from the user
		//creating the object of another class
		LargestdigitinaNumber pr = new LargestdigitinaNumber();
		//calling a method  using the object of another class
		pr.findthelargestDigit(num);

	}

}
