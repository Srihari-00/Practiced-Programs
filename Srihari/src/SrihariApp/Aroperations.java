package SrihariApp;
import java.util.*;

public class Aroperations {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of num1 = ");
		int num1 = scan.nextInt();
		System.out.println("Enter the vallue of num2");
		int num2 = scan.nextInt();
		
		Add(num1,num2);
		subtract(num1, num2);
		multiply(num1,num2);
		div(num1,num2);
		//System.out.println("The division is : "+z);
		remainder(num1,num2);
		//System.out.println("The remainder is : "+z);

	}
	public static void Add(int x, int y)
	{
		int z = x+y;
		//return z;
		System.out.println("The add is "+z);
	}
	public static void subtract(int x, int y)
	{
		int z= y-x;
		//return z = y-x;
		System.out.println("The sub is "+z);
	}
	public static void multiply(int x, int y)
	{
		int z = x*y;
		//return z=x*y;
		System.out.println("The multiply is "+z);
	}
	public static void div(int x, int y)
	{
		
		int z = y/x;
		System.out.println("The div is "+z);
	}
	public static  void remainder(int x,int y)
	{
		
		int z = y%x;
		System.out.println("The remainder is "+z);
	}
	

}
