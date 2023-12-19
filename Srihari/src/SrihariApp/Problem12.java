package SrihariApp;
import java.util.*;
public class Problem12
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height in inches : ");
		double a = scan.nextDouble();
		
		double b = convertinchesToFeet(a);
		System.out.println("The height in feet is : "+b);

	}
	public static double convertinchesToFeet(double x)
	{
		double z = x/12;
		return z;
	}

}
