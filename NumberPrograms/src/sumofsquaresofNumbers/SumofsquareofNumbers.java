package sumofsquaresofNumbers;

public class SumofsquareofNumbers 
{
	void calculateTheSquaresofNNumbers(int x)//passing the parameters
	{
		int sum=0;//initializing the sum as 0
		for(int i=1;i<=x;i++)//where i is the numbers starting from 1
		{
			int result=i*i;//performing the square of a number and storing the value in result
			sum+=result;//adding the sum and result and reassigning the value to the sum
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The sum of squares of Numbers is : "+sum);
	}


}
