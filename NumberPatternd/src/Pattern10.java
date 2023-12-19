import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();
		int a =1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(a<=4)
				{					
					System.out.print("0"+a*2+" ");
					
				}
				else
				{
					System.out.print(a*2+" ");
				}
				a++;
			}
			System.out.println();
		}

	}

}
