package firstNprimeNumbers;

public class FirstNPrimeNumbers 
{
	void printPrimeNumbers(int x)//giving the Parameters
	{
		int count=0;
		System.out.println("The Prime numbers are : ");
		for(int i=1;i<=x;i++)//where i is the numbers to be checked
		{
			count=0;
			for(int j=2;j<=i;j++)//where j is the number to check the number is divisible by j or not
			{
				if(i%j==0)//if the number is divisible by the j number
				{
					count++;//increment the count
				}
			}
			if(count==1)//count value is 1
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
