import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args)
	{
		//Creating a scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the last number : ");//asking the user to give input
		//creating the object of another class
		Even pr = new Even();
		//accepting the user input
		int num = scan.nextInt();
		
		//using the object of another class, calling the method		
		pr.check(num);

	}

}
