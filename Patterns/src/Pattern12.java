
public class Pattern12 {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)//for Columns
		{
			for(int j=1;j<=i;j++)//for Rows
			{
				System.out.print(" ");
			}
			//Displaying the Rows
			for(int j=1;j<=11-2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
