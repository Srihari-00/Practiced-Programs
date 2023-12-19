import java.util.*;
public class Problem4 
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
		if(a>=1 && a<=10)
		{
			System.out.println("Range-1");
		}
		else if(a>=11 && a<=20)
		{
			System.out.println("Range-2");
		}
		else if(a>=21 && a<=30)
		{
			System.out.println("Range-3");
		}
		else if(a>=31 && a<=40)
		{
			System.out.println("Range-4");
		}
		else if(a>=41 && a<=50)
		{
			System.out.println("Range-5");
		}
		else
		{
			System.out.println("Out of Range");
		}

	}

}
