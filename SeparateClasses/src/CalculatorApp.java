import java.util.*;
public class CalculatorApp
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		double a = scan.nextDouble();
		System.out.println("Enter the 2nd value : ");
		double b = scan.nextDouble();
		System.out.println("Enter the operation to perform : ");
		char c = scan.next().charAt(0);
		
		Calculator.calculate(a,b,c);

	}

}
