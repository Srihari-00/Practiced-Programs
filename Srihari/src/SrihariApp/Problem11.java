package SrihariApp;
import java.util.*;
public class Problem11
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius value : ");
		double r = scan.nextDouble();
		
		double A = calculateSurfaceArea(r);
		System.out.println("The surface area of Planet is : "+A);

	}
	public static double calculateSurfaceArea(double x)
	{
		double  z = 4*(3.14)*x*x;
		return z;
	}

}
