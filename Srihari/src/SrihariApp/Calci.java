package SrihariApp;
import java.util.*;
public class Calci {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = scan.nextInt();
		System.out.println("Enter the value of B ");
		float b = scan.nextFloat();
		
		calcuLator(a,b);
		Operators(a,b);
	}
	public static void calcuLator(int x, float y)
	{
		System.out.println("The add result is : "+(x+y));
		System.out.println("The sub rresult is : "+(x-y));
		System.out.println("The multiply result is : "+(x*y));
		System.out.println("The div result is : "+(x/y));
		System.out.println("The percentile result is : "+(x%y));
	}
	
	public static void Operators(int a, float b)
	{
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
}
