package sumofsquaresofNumbers;
import java.util.*;
public class SumofsquaresofNumbersApp {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();//accepting the user input
		//creating the object of another class
		SumofsquareofNumbers pr = new SumofsquareofNumbers();
		
		//calling a method by using the object of another class
		pr.calculateTheSquaresofNNumbers(num);

	}

}
