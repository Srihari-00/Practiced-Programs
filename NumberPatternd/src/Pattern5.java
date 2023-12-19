import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int a=1;
		for(int i=1;i<=num;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

	}

}
