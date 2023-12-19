import java.util.*;

public class Voter {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scan.nextInt();
		
		Voters(age);

	}
	public static void Voters(int a)
	
	{
		if(a>18)
		{
			System.out.println("You are eligible to vote :-)");
		}
		else
		{
			System.out.println("You are not eligible to Vote :-( ");
		}
	}

}
