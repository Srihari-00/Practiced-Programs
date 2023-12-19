package SrihariApp;
import java.util.*;

public class Problem15 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double a = scan.nextDouble();
		
		double half = halveTheNumber(a);
		System.out.println("The half of the amount is : "+half);

	}
	public static double halveTheNumber(double x)
	{
		double z = x/2.0;
		return z;
	}

}
