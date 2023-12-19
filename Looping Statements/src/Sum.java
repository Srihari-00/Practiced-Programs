
public class Sum 
{
	void check(int n)
	{
		int sum=0;//initializing the sum
		for(int i=1;i<=n;i++)//n natural numbers
		{
			//formulae for calculating the sum of all numbers
			sum=n*(n+1)/2;
			System.out.println(i);//printing the I
		}
		System.out.println(sum);//printing the sum
	}

}
