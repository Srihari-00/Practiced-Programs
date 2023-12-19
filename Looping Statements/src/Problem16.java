import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) 
	{
		//Creating the scanner class
		Scanner scan = new Scanner(System.in);
		//asking the user to enter the Input
		System.out.println("Enter the number : ");
		//creating an object of another class
		Table pr = new Table();
		//accepting the input from the user
		int num = scan.nextInt();
		
		//using the class object, calling the method
		pr.check(num);

	}

}
