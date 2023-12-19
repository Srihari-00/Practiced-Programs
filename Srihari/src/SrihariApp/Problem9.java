package SrihariApp;
import java.util.*;
public class Problem9 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = scan.nextInt();
		
		int cube = Cubes(num);
		System.out.println("The cube of given number is : "+cube);
	}
	public static int Cubes(int x)
	{
		return x*x*x ;
	}

}
