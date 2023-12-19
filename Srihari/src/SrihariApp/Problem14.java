package SrihariApp;
import java.util.*;
public class Problem14
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time in minutes : ");
		int Minutes = scan.nextInt();
		
		double hours = convertToHours(Minutes);
		System.out.println("The time in hours is : "+hours);

	}
	public static double convertToHours(int x)
	{
		//double y = (int)x;
		double z = (x/60.00);
		return z;
	}

}
