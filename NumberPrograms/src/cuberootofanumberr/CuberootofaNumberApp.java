package cuberootofanumberr;

import java.util.Scanner;

public class CuberootofaNumberApp {

	public static void main(String[] args)
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();//accepting the input from the user
		//creating the object of another class
		CuberootofaNumber pr = new CuberootofaNumber();
		//calling the method by using object of another class and printing the result
		System.out.println("The cube root of the number "+num+" is "+pr.calculateTheCuberootofaNumber(num));

	}

}
