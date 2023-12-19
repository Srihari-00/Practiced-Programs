package sumofnaturalnumbers;

public class SumoffirstNnaturalnumbers 
{
	void sumofNaturalNumbers(int x)//importing the parameters
	{
		int sum=0;
		System.out.println("The Natural numbers are : ");
		for(int i=1;i<=x;i++)//where i are the Numbers 
		{
			sum+=i;//adding the numbers to sum and re-assigning the value again to sum 
			System.out.println(i);//displaying the numbers
		}
		System.out.println("The sum of the Natural Numbers "+sum );//Displaying the sum
	}

}
