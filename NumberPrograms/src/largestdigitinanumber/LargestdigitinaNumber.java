package largestdigitinanumber;

public class LargestdigitinaNumber 
{
	void findthelargestDigit(int num)//Passing the parameters
	{
		int largest_digit = num%10;//storing the remainder in largest_digit
		while(num>=10)//if the number is greater than or equal to 10
		{
			num/=10;//Number is divisible by 10 and assigning the value again in the num
			int digit=num%10;//storing the remainder of number divisible by 10
			if(digit>largest_digit)//checking if the digit id greater than largest_digit or not
			{
				largest_digit=digit;//assigning the digit value to the largest_digit
			}
		}
		//displaying the Largest_digit in a number
		System.out.println("The largest digit in a Number is "+largest_digit);
		
	}

}
