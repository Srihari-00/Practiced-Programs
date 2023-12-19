import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter columns : ");
		int num = scan.nextInt();
		int a=num*num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(a<10)
				{
					System.out.print("0"+a+" ");
				}
				else
				{
					System.out.print(a+" ");
				}
				a--;
			}
			System.out.println();
		}

	}

}
