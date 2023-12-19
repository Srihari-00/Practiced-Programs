package squarerootofanumber;

import java.util.Scanner;

public class SquarerootofaNumberApp {

	public static void main(String[] args)
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();//accepting the user input
		//creating the objectof another class
		SquarerootofaNumber pr= new SquarerootofaNumber();
		//calling a method using the object of another class
		pr.calculateSquareRootofaNumber(num);

	}

}
