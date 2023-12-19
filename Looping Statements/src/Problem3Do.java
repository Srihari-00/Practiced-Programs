
public class Problem3Do 
{

	public static void main(String[] args) 
	{
		//Declaring the variable and initialising the value to it
		int i=-100;
		//Using the Do While Loop
		do
		{
			//Checking the condition whether the number is less than 0 or not
			if(i<0)
			{
				//If the condition is TRUE, then check the number is not divisible by 2
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
			//Incrementing the value of the I 
			i++;
		}
		//Checking the condition whether the number is less than 100 or not
		while(i<100);
		
	}

}
