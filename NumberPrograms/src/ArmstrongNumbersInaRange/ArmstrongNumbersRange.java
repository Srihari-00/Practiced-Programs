package ArmstrongNumbersInaRange;

public class ArmstrongNumbersRange 
{
	void displayAllArmstrongNumbers(int num)//passing the parameters
	{
		
		System.out.println("The Armstrong Numbers are : ");
		for(int i=1;i<=num;i++)//where i is the numbers from 1 to n
		{
			int sum=0;//initializing the sum
			int temp=i;//assigning the i value to the temp
			while(temp>0)//if temp greater than 0
			{
				int digit=temp%10;//storing the remainder of the temp divided by 10 
				sum=sum+digit*digit*digit;//assigning the result of addition of the sum and cube of the digit
				temp=temp/10;//assigning the quotient value of temp divided by 10 again to the temp
			}
			if(i==sum)//if i is equal to the sum
			{
				System.out.print(i+" ");
			}
		}
	}

}
