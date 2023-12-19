package SrihariApp;
import java.util.*;
public class Arithmatic {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a = ");
		long a = scan.nextLong();
		System.out.println("Enter the value b = ");
		long b = scan.nextLong();
		
		add(a,b);
		
	}
	
	public  static void add(long x, long y)
	{
		System.out.println("The sum of arthematics is : "+(x+y));
	}

}
