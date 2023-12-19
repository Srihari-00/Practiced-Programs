package SrihariApp;
import java.util.*;
public class FullName {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur first name : ");
		String str1 = scan.nextLine();
		System.out.println("Enter ur Last name : ");
		String str2 = scan.nextLine();
		
		Concatenating(str1, str2);

	}
	public static void Concatenating(String x, String y)
	{
		System.out.println("Your firsst name is : "+x);
		System.out.println("your last name is : "+y);
		System.out.println("Your full name is : "+(x+y));
	}
	

}
