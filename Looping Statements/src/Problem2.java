public class Problem2 
{

	public static void main(String[] args) 
	{
		//using the for loop
		//Declaring a variable and initialising the value to it
		//Checking whether the number is less than 100 or not
		//Incrementing the value of I
		for(int i=-100;i<100;i++)
		{
			//Checking wherther the number is less than 0 or not
			if(i<0)
			{
				//Checking whether the number is not divisible by 2 or not
				if(i%2!=0)
				{
					//Printing the value of I
					System.out.println(i);
				}
			}
			//Checking whether the number is greater than 0 or not 
			else if(i>0)
			{
				//Checking whether the number is divisible by 2 or not 
				if(i%2==0)
				{
					//Printing the value of the I
					System.out.println(i);
				}
			}
			
		}
	}

}
