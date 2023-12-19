
public class Farmer {

	public static void main(String[] args) 
	{
		//Declaring the variable and initializing a value to it
		//Checking whether the number is less than or equal to 3
		//Incrementing the value of I
		for(int i=0;i<=3;i++)
		{
			//checking whether the number is equal to 1 or not
			if(i==1)
			{
				//Printing 
				System.out.println("Farmer completed sowing the Row 1,spot1");
			}
			//Checking whether the number is equal to 2
			else if(i==2)
			{
				//Printing
				System.out.println("Farmer completed sowing the Row 1,spot2");
			}
			//
			else
			{
				System.out.println("Farmer completed sowing the Row 1,spot3");
			}
		}
		for(int i=4;i<=6;i++)
		{
			if(i==4)
			{
				System.out.println("Farmer completed sowing the Row 2,spot1");
			}
			else if(i==5)
			{
				System.out.println("Farmer completed sowing the Row 2,spot2");
			}
			else
			{
				System.out.println("Farmer completed sowing the Row 2,spot3");
			}
		}
		for(int i=7;i<=9;i++)
		{
			if(i==7)
			{
				System.out.println("Farmer Completed the Sowing the seeds in Row3, spot1");
			}
			else if(i==8)
			{
				System.out.println("Farmer completed sowing the Row 3,spot2");
			}
			else
			{
				System.out.println("Farmer completed sowing the Row 3,spot3");
			}
		}
		System.out.println("The Farmer has completed sowing the seeds :-)");

	}

}
