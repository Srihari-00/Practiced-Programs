
public class Pattern14 {

	public static void main(String[] args) 
	{
		//for Columns
		for(int i=1;i<=5;i++)
		{
			//for printing the spaces in Rows
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			//For Columns
			for(int j=1;j<=5;j++)
			{
				//Print only when the condition is true
				if(i==1 || j==1 || j==5 || i==5)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}

	}

}
