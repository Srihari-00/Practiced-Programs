
public class Sum3While {

	public static void main(String[] args) 
	{
		//Declaring and assigning the values to the variables
		int sum=0;
		int i=1;
		//Checking whether the number is less than 50 or not
		while(i<50)
		{
			//Checking whether the number is divisible by 3 or not
			if(i%3==0)
			{
				//Adding the numbers which are divisible by 3
				sum+=i;
				//Printing the Value of I
				System.out.println(i);
			}
			//Incrementing the value of the I
			i++;
		}
		//Printing the value of the sum of the numbers which are divisible by 3
		System.out.println("The sum of the numbers divisible by 3 is "+sum);

	}

}
