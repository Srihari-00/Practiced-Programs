package firstNprimeNumbers;

import java.util.Scanner;

public class FirstNPrimeNumbersApp {

	public static void main(String[] args) 
	{
		//Creating scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();//accepting the input from the user
		FirstNPrimeNumbers pr = new FirstNPrimeNumbers();//creating the object of another class
		
		//calling the method, by using the object of another class
		pr.printPrimeNumbers(num);

	}

}
