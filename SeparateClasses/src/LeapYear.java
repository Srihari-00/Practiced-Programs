import java.util.*;
public class LeapYear {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();//taking the user input
		//if year is greater than 0
		while(year >0) 
		{
			if((year%4==0))//the remainder is 0 when year is divisible by 4 
			{
				System.out.println("leap year");
				break;
			}
			else 
			{
				System.out.println(" not a Leap year");
				break;
			}
		}



	}
}
