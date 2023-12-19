import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers : ");//asking the user input
		//creating the object of another class
		Prog pr = new Prog();
		//accepting the user input
		int num1 = scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		//using the object of another class, calling a method
		pr.check(num1,num2,num3);

	}

}
