
public class Pattern13 {

	public static void main(String[] args) 
	{
		for(int i=1;i<5;i++)//for Columns
		{
			//For displaying the spaces in Rows
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			//for Displaying the Rows
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//for Columns
		for(int i=1;i<=5;i++)
		{
			//For displaying the spaces in Rows
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//for dispalying the Rows
			for(int j=1;j<=11-2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
