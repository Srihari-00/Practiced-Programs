import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the columns : ");
		int num = scan.nextInt();
		int a = 1;
		for(int i=1;i<=num;i++ )
		{
			for(int j=1;j<=num;j++)
			{
				if(a<=9)
				{
					System.out.print("0"+a+" " );
					
				}
				else
				{
					System.out.print(a+" ");
				}
				a++;
			}
			System.out.println();
		}

	}

}
