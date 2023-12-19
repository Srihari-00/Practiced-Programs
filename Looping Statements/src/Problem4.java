//Importing the Scanner class
import java.util.*;
public class Problem4
{
	public static void main(String[] args)
	{
		//Creating the scanner class
		Scanner scan = new Scanner(System.in);
		//Declaring the variable and accepting the value from the user
		double a = scan.nextDouble();
		//Checking whether the number is greater than 1 or not 
		while(a>1)
		{
			//Dividing the value to the A and assigning the value to the A
			a=a/2;
			//Printing the value of A
			System.out.println(a);
			
		}
	}

}
