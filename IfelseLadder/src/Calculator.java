import java.util.*;
public class Calculator
{

	public static void main(String[] args) 
	{
		//Creating the object of the Scanner class
		Scanner scan = new Scanner(System.in);
		//Asking the user to enter the 1st value
		System.out.println("Enter the 1st value : ");
		double a = scan.nextDouble();
		//Asking the user to enter the 2nd value
		System.out.println("Enter the 2nd value : ");
		double b = scan.nextDouble();
		//Asking the user to enter the operation to be performed
		System.out.println("Enter operation u want to perform : ");
		char c = scan.next().charAt(0);
		
		
		//checking whether the operation is Add()
		if(c == '+')
		{
			System.out.println("The addition result is "+(a+b));
		}
		//checking whether the operation is Subtraction(a>b)
		else if(c=='-' )
		{
			if(a>b)
			{
			System.out.println("The subtractionn result is "+(a-b));
			}
		
		//checking whether the operation is Subtraction(a<b)
			else if(b>a)
			{
					System.out.println("The Subtaction result is "+(b-a));
			}
		}
		//checking whether the operation is multiplication()
		else if(c == '*')
		{
			System.out.println("The multiplication result is "+(a*b));
		}
		//checking whether the operation is division()
		else if(c == '/')
		{
			if(b==0)
			{
				System.out.println("Denominator cannot be performed");
			}
			else
			{
			System.out.println("The division result is "+(a/b));
			}
		}
		//checking the operation is valid if not print to enter only these operations
		else
		{
			System.out.println("You have to enter the +, -, *, / operations only");
		}

	}

}
