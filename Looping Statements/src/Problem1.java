//Importing the scanner class
import java.util.*;
public class Problem1 {

	public static void main(String[] args)
	{
		//Creating the Scanner class
		Scanner scan = new Scanner(System.in);
		//Declaring a variable and accepting the value from the user 
		int num = scan.nextInt();
		//using the for loop
		//assigning the num value to the variable i
		//Checking the value of I is less than or equal to 50 or not
		//Incrementing the value of I
		for(int i=num; i<=50;i++)
		{
			//Checking whether the number is divisible by 2 or not 
			if(i%2==0)
			{
				//printing the value of I
				System.out.println(i);
			
			}
		}

	}

}
