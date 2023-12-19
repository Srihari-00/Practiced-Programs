package SrihariApp;
import java.util.*;
public class Problem13 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal amount : ");
		double P = scan.nextDouble();
		System.out.println("Enter the rate : ");
		double R = scan.nextDouble();
		System.out.println("Enter the time : ");
		double T = scan.nextDouble();
		
		double Interest = SimpleInterest(P,R,T);
		System.out.println("The calculated simple interest is : "+Interest);

	}
	public static double SimpleInterest(double p, double r, double t)
	{
		double I = p*r*t;
		return I;
	}

}
