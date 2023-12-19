
public class PrimeNumbers 
{
	void firstNPrimeNumbers(int x)
	{
		int count =0;
		for(int i=1;i<=x;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0 )
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i+" ");
			}
		}
	}

}
