package armstrongNumbers;

public class ArmstrongNumber 
{
	void checkArmstrongNumber(int num)//passing the parameters
	{
		int sum=0;//initializing the sum
		int temp=num;//assigning the num value to the temp variable
		while(temp>0)//where temp is greater than 0
		{
			int digit=temp%10;//storing the remainder of temp divided by 10
			sum+=digit*digit*digit;//adding the sum with cube of digit
			temp=temp/10;//dividing the temp by 10 and assigning the value to the temp again
		}
		//Displaying the sum
		System.out.println(sum);
		if(sum==num)//sum is equal to number
		{
			System.out.println("The number is an Armstrong Number ");
		}
		else
		{
			System.out.println("The number is not an Armstrong Number ");
		}
	}

}
