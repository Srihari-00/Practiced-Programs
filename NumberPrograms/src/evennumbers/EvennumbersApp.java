package evennumbers;

import java.util.Scanner;

public class EvennumbersApp {

	public static void main(String[] args)
	{
		//creating the object of scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");//asking the user to give input
		int num=scan.nextInt();//accepting the input from the user
		Evennumbers pr = new Evennumbers();//creating the object of another class
		
		pr.evenNumberscheck(num);//using the object of another class calling the method
		
	}

}
