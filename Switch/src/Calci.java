import java.util.*;
public class Calci 
{

	public static void main(String[] args)
	{
		//Creating the Object of the scanner class
		Scanner scan = new Scanner(System.in);
		//Asking the user to enter the 1st value
		System.out.println("Enter the 1st value : ");
		double a = scan.nextDouble();
		//Asking the user to enter the 2nd value
		System.out.println("Enter the 2nd value : ");
		double b = scan.nextDouble();
		//Asking the user to enter the operation to be performed 
		System.out.println("Enter the operation to be performed : ");
		char c = scan.next().charAt(0);
		
		switch(c)
		{
		case '+' ://Addition Operation 
			System.out.println("The additionn result is "+(a+b));
			break;
		case '-' ://Subtraction Operation
			System.out.println("The subtraction result is "+(a-b));
			break;
		case '*' ://Multiplication Operation
			System.out.println("The multiplication result is "+(a*b));
			break;
		case '/' : //Division Operation
			System.out.println("The dividion result is "+(a/b));
			break;
		default ://other than the mentioned operations
			System.out.println("Invalid Input");
		
		}
	
		

	}

}
