
public class Pattern8 {

	public static void main(String[] args) 
	{
		//Columns
		for(int i=1;i<=5;i++)
		{
			//Rows
			for(int j=1;j<=i;j++)
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
