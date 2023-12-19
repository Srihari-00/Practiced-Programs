import java.util.Scanner;

public class TwoDArrayPrimeNumbers {

	public static void main(String[] args)
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter the rows");
		int row= scan.nextInt();
		System.out.println("Enter the columns");
		int column=scan.nextInt();
		System.out.println("Enter a 2D array : ");
		int [][] arr = new int[row][column] ;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=2;k<arr[i][j];k++)
				{
					if(arr[i][j]%k==0)
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
		
		
	}

}
