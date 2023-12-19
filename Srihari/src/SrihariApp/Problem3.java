package SrihariApp;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = scan.nextInt();
		
		doubleNumber(num);
		//System.out.println("The double of number is = "+num);

	}
	
	public static void doubleNumber(int x)
	{
		int y = 2*x;
		System.out.println("The double is "+y);
	}

}
