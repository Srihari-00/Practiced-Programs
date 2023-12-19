import java.util.*;
class AdultApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scan.nextInt();
		//Calling a method Percentage
		Adult.checkAdult(age);
	}
}