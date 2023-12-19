package SumBecomesaSingleDigit;

public class SumofDigitsBecomeSingleDigit 
{
	void calculateTheSumuntilSingleDigit(int x)//passing the parameters
	{
		
		while(x>9)//if the number is greate than 9 for checking whether it is single digit or not
		{
			int sum=0;//initializing the sum as 0
			while(x>0)//whether the number is greater than 0
			{
				sum+=x%10;//adding the remainder to the sum and assigning the value to the sum again
				x=x/10;//dividing the number by 10 to get a digit to be deleted
				
			}
			x=sum;//assigning the sum value to the number
		}
		//displaying the result
		System.out.println("The sum of the digits until it becomes single digit : "+x);
	}

}
