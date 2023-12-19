import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = scan.nextInt();
		int count = 1;
		int a = count*2;
		int b= 2*count-1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(count<=5)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(b);
				}
				count++;
			}
			System.out.println();
		}
		
	}

}
