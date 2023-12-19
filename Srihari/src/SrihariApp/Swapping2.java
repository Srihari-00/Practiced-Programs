package SrihariApp;
import java.util.*;
public class Swapping2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value : ");
		int a = scan.nextInt();
		System.out.println("Enter B value : ");
		int b = scan.nextInt();
		
		Swapping(a,b);
		Swapping2(a,b);

	}
	public static void Swapping(int a, int b)
	{
		b = a + b;
		a = b-a;
		System.out.println("The value of a after swapping : "+a);
	}
	public static void Swapping2(int a, int b)
	{
		a = a + b;
		b = a - b;
		System.out.println("The value of b after swapping : "+b);
	}

}
