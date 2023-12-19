package SrihariApp;
import java.util.*;
public class Problem5 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed : ");
		double speed = scan.nextDouble();
		System.out.println("Enter the time taken : ");
		double time = scan.nextDouble();
		
		double Distance = calculateDistance(speed, time);
		System.out.println("The distance travelled is : "+Distance);
		
	}
	public static double calculateDistance(double x, double y)
	{
		return (x*y);
	}

}
