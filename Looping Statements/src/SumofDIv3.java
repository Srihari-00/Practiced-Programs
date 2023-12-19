
public class SumofDIv3 
{
	public static void main(String[] args)
	{
		//declaring and assigning the values to the variables
		int sum = 0;
		//declaring the value and checking the condition whether the number is less than 50 or not
		for(int i=1;i<50;i++)
		{
			//Checking the condition whether the number is divisible by 3 or not
			if(i%3==0)
			{
				//Adding the numbers which are divisible by 3
				//int sum = 0;
				sum+=i;
				//Printing the number
				System.out.println(i);
				
			}
			
			
		}
		//Printing the sum of all the numbers which are divisible by 3
		System.out.println("The sum of numbers divisible by 3 is "+sum);

	}

}
