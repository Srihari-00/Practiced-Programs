import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		//asking the user to give the input
		System.out.println("Enter the numbers : ");
		//Creating the object of the another class
		Sum pr = new Sum();
		//taking the user input
		int n=scan.nextInt();
		
		//using the object of the another class, calling the method
		pr.check(n);

	}

}
