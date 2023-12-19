
public class Sum3Do {

	public static void main(String[] args) 
	{
		//declaring and assigning the values to the Variables
		int sum=0;
		int i=1;
		//using the Do While looping statements
		do
		{
			//checking whether the number is divisible by 3 or not
			if(i%3==0)
			{
				//Adding the numbers which are divisible by 3
				sum+=i;
				//Printing the value
				System.out.println(i);
				
			}
			//Incrementing the value
			i++;
		}
		//Checking whether the value is less than 50 or not
		while(i<50);
		//Printing the sum of all the digits which are divisible by 3!
		System.out.println("The sum of the numbers divisible by 3 is "+sum);
	}

}
