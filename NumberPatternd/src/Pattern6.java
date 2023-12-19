import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter columns : ");
		int num = scan.nextInt();
		int a=num*num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}

	}

}
