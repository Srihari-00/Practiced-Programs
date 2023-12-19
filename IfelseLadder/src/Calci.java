import java.util.Scanner;
public class Calci {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println("The result is : "+(a-b));
		}
		else if(a<b)
		{
			System.out.println("The result is : "+(b-a));
		}
		

	}

}
