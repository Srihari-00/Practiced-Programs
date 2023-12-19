import java.util.*;
public class CalciApp
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
				
				Calci.CalciAp(a, b, c);

	}

}
