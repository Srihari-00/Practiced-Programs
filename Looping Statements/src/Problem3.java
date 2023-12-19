
public class Problem3 {

	public static void main(String[] args) 
	{
		//Declaring a variable and initiallising a value to it
		int i = -100;
		//By using the while loop, Checking whether the number is less than 100 or not
		while(i<100)
		{
			//Checking whether the number is less than 0 or not 
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
					//Printing the value of I
					System.out.println(i);
				}
			}
			//Incrementing the value of I
			i++;
		}

	}

}
