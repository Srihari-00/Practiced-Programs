import java.util.*;
public class VotingApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible to Vote :-) ");
			
		}
		else
		{
			System.out.println("You are not eligible to Vote :-( ");
		}

	}

}
