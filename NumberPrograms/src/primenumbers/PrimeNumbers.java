package primenumbers;

public class PrimeNumbers
{
	void checkPrimeNumberorNot(int x)
	{
		int count=0;//number of times the number get divided
		for(int i=1;i<=x;i++)// for the number to be checked
		{
			count=0;
			for(int j=2;j<=i;j++)// to check the number is divided by no.of times
			{
				if(i%j==0)
				{
					count++;//incrementing the count
				}
			}
		}
		if(count==1)
		{
			System.out.println("PrimeNumber");
		}
		else
		{
			System.err.println("Not a PrimeNumber");
		}
	}

}
