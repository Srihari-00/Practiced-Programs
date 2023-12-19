import java.util.*;

public class ConvertNumberToAlphabets 
{

	public static void main(String[] args) 
	{
		//Creating the Scanner class object
		Scanner scan = new Scanner(System.in);
		//Asking the  user to enter the value
		System.out.println("Enter the value : ");
		int a = scan.nextInt();
		
		switch(a)
		{
		case 1 : 
			System.out.println("One");
			break;
		case 2 : 
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
