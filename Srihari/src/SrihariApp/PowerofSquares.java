package SrihariApp;
import java.util.*;

public class PowerofSquares 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num value : ");
		long num = scan.nextInt();
		
		long Square = Powers(num);
		System.out.println("The result is : "+Square);
	}
	public static long Powers(long x)
	{
		return x*x;
	}

}
