
public class Holopattern9 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//Columns
		{
			for(int j=i;j<=5;j++)//For Rows
			{
				System.out.print(" ");
			}
			//Displaying 
			for(int j=i;j<=5;j++)
			{
				//print only either one of the codition is true
				if(i==1 || j==5 || j==i)
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
