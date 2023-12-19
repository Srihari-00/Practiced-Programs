
public class Holopattern10 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//for Columns
		{
			for(int j=i;j<=5;j++)//for Rows
			{
				System.out.print(" ");
			}
			//Displaying
			for(int j=1;j<=i;j++)
			{
				//print either of the condition is true
				if(i==5 || j==1 || j==i)
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
