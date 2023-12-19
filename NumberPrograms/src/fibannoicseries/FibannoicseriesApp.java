package fibannoicseries;

import java.util.Scanner;

public class FibannoicseriesApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();//accepting the user input
		Fibannoicseries pr= new Fibannoicseries();//creating  an object of another class
		//calling the method by using the object of another class 
		pr.printFibannoicseries(num);

	}

}
