
public class Pattern9 {

	public static void main(String[] args)
	{
		//for columns
		for(int i=1;i<=5;i++)
		{
			//for Rows
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			//Displaying the Rows
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
