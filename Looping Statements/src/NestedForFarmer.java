
public class NestedForFarmer {

	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)// Loop for Rows
		{
			for(int j=1;j<=5;j++)//Loop for Spots
			{
				System.out.println("Farmeer has sowed the seeds in the Row "+i+" in spot "+j);
			}
		}
		System.out.println("Farmer has completed the sowing the seeds");

	}

}
