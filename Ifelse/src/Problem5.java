import java.util.*;
public class Problem5
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value : ");
		char a = scan.next().charAt(0);
		
		Action(a);
	}
	public static void Action(char x)
	{
		if(x>='A' && x<='Z')
		{
			System.out.println("Character is Upper case :-)");
		}
		else if(x>='a' && x<='z')
		{
			System.out.println("Character is Lower case :-)");
		}
		else 
		{
			System.out.println("It is not a character :-)");
		}

	}

}
