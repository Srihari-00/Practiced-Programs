import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();
		int count=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+count+" ");
				}
				else
				{
					System.out.print(count+" ");
				}
				count++;
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				
				System.out.print(count+" ");
			
				count++;
			}
			
			System.out.println();
		}

	}
}