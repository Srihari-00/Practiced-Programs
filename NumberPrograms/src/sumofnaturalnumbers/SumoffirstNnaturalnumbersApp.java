package sumofnaturalnumbers;

import java.util.Scanner;

public class SumoffirstNnaturalnumbersApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();//accepting the user input
		//creating an object of another class
		SumoffirstNnaturalnumbers pr = new SumoffirstNnaturalnumbers();
		
		pr.sumofNaturalNumbers(num);//using object of another class, calling the method
		
		
	}

}
