import java.util.*;
public class DisplayingTheMonths
{

	public static void main(String[] args)
	{
		//Creating a object of the Scanner class
		Scanner scan = new Scanner(System.in);
		//Asking the user to enter the input
		System.out.println("Enter the value : ");
		int a = scan.nextInt();
		//Asking the
		switch(a)
		{
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("March");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6 :
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9 :
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12 :
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
