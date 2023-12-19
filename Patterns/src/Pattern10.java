
public class Pattern10 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)//for I= columns
		{
			for(int j=5;j>=i;j--)//for j=Rows
			{
				System.out.print(" ");
			}
			//Displaying the Rows
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
