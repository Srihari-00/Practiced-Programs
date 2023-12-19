import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scan.nextInt();
		int count = 1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				
				int a = 2*count-1;
					if(count<=5)
					{
						System.out.print("0"+a+" ");
					}
					else
					{
						System.out.print(a+" ");
					}
					count++;
				
			}
			System.out.println();
		}

	}

}
