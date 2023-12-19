package SrihariApp;
import java.util.*;
public class Swapping1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the A value : ");
		int a = scan.nextInt();
		System.out.println("Enter the B value : ");
		int b = scan.nextInt();
		
		Swapping(a,b);
		
	}
	public static void Swapping(int a, int b)
	{
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of A after swapping : "+a);
		System.out.println("Value of B after swapping : "+b);
	}

}
