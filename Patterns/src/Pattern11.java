
public class Pattern11 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=7;i++)//where i is the columns
		{
			for(int j=6;j>=i;j--)//where j is the Rows
			{
				System.out.print(" ");
			}
			//Displaying the Rows
			for(int j=1;j<2*(i-1);j++)
			{
				
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
