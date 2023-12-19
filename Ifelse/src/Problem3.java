import java.util.*;
public class Problem3
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int S = scan.nextInt();
		
		Action(S);
	}
	public static void Action(int a)
	{
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a<0)
		{
			System.out.println("The number is Negative");
		}
		else
		{
			System.out.println("The number is ZERO");
		}

	}

}
