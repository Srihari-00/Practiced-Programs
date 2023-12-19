package sumofdigits;

import java.util.Scanner;

public class SumofDigitsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//creating the scanner class
		System.out.println("Enter a number : ");//asking the user to enter the input
		int num = scan.nextInt();//storing the value in the num variable
		Sumdigits pr = new Sumdigits();//creating the object of the another class
		
		pr.sumofDigits(num);//calling the method using the object of the another class
				
		
	}

}
