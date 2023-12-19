package primenumbers;

import java.util.Scanner;

public class PrimeNumberApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//creating the scanner class
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		PrimeNumbers pr = new PrimeNumbers();//Creating the object of another class
		
		pr.checkPrimeNumberorNot(num);//calling a method using object of another class
		
	}

}
