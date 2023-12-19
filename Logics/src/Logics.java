
public class Logics
{
	
	void Divisibleby2(int n)//1 Importing the n value
	{
		//if(n>100)//checking whether the number is greater than 100 or not
		{
			System.out.print("Divisible by 2 : ");//Displaying the message
			for(int i=1;i<=n;i++)//initializing and checking I is less than number
			{
				if(i%2==0)//Divisible by 2 or not
				{
					System.out.print(i+" ");//display the number
				}
			}
			System.out.println(" ");//creating empty space and allows to print in next line
		}
	}
	void Divisiibleby3(int n)//2 importing the number
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("Divisible by 3 : ");//displaying the message
			for(int i=1;i<=n;i++)//initializing, checking the i is less than or equal to number and incrementing I
			{
				if(i%3==0)//Checking the number is divisible by 3 or not
				{
					System.out.print(i+" ");//displaying the i value
				}
			}
			System.out.println(" ");//Creating the empty space in the next line
		}
	}
	void Divisibleby5(int n)//3 importing the number
	{
		//if(n>100)//checking if the number is greater than 100 or not
		{
			System.out.print("Divisible by 5 : ");//displaying the message
			//initializing and checking the I is less than or equal to number
			for(int i=1;i<=n;i++)//incrementing the I value
			{
				if(i%5==0)//checking the number is divisible 5 or not
				{
					System.out.print(i+" ");//displaying the i value 
				
				}
			}
			System.out.println(" ");//creating empty space in the next Line
			
		}
		
	}
	void Divisibleby2and5(int n)//4 Importing the number into method
	{
		//if(n>100)//checking the number is less than 100 or not
		{
			System.out.print("Divisible by 2 and 5 : ");//displaying the message
			//initializing and checking the I value is less than or equal to number
			
			for(int i=1;i<=n;i++)//incrementing the i value
			{
				if(i%2==0 && i%5==0)//checking the number is divisible by both 2 and 5
				{
					System.out.print(i+" ");//displaying the i value 
				}
			}
			System.out.println(" ");//creating empty space in the next line
		}
	}
	void Divisibleby3andintable5(int n)//5 importing the number into method
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("Divisible by 3 and comes in table 5 : ");//displaying message
			//initializing and checking the i value is less than or equal to number
			for(int i=1;i<=n;i++)//incrementing the I value
			{
				if(i%3==0 && i%5==0)//checking the number is divisible by both 3 and 5
				{
					System.out.print(i+" ");//displaying the I value
				}
			}
			System.out.println(" ");//creating the empty space in the next line
		}
	}
	void PrimeNumbers(int n)//6 //importing the number into the method
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("The Prime Numbers are : ");//displaying the message
			int count =0;//initializing the count =0
			//initializing and checking the I is less than number 
			for(int i=1;i<=n-1;i++)//incrementing the I value
			{
				count=0;//declaring the count value is 0
				//for number of times the i gets divisible by j
				//initializing the j value and checking the j is less than or equal to i and incrementing the j value
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)//Checking the number is divisible by j or not
					{
						count++;//incrementing the count
					}
					
				}
				if(count==1)//count value is one then enter in to the statement
				{
					System.out.print(i+" ");
				}
				
			}
			System.out.println(" ");//creating the empty space in the next line
		}
	}
	void EvenPrimeNumbers(int n)//7 importing the number
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("All the even Prime Numbers are : ");
			int count =0;//initializing the count value
			for(int i=1;i<=n;i++)//initializing and checking the i less than number or not
			{
				count=0;//taking the count as 0
				for(int j=2;j<=i;j++)//initializing j for number of times divisible
				{
					if(i%j==0 && i%2==0)//checking the condition is divisible by both j and 2
					{
						count++;//incrementing the count value
					}
				}
				if(count==1)//checking the count is 1 then enter the statement
				{
					System.out.print(i+" ");//printing i
				}
			}
			System.out.println(" ");
		}
	}
	void OddPrimeNumbers(int n)//8 importing the number
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("All the odd prime numbers are : ");
			int count = 0;//initializing the count as 0
			for(int i=1;i<=n;i++)//for i as the number
			{
				count=0;
				for(int j=2;j<=i;j++)//for j as the number of times divisible
				{
					if(i%j==0 && i%2!=0)//checking if the number is divisible by both j and 3
					{
						count++;//incrementing the count value
					}
				}
				if(count==1)//if count value is 1
				{
					System.out.print(i+" ");//printing the i value
				}
			}
			System.out.println(" ");
		}
	}
	
	void EvennumbersDivisibleby3(int n)//9 importing the number into the method
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			//displaying the message
			System.out.print("Even numbers which are divisible 3 : ");
			//initializing and checking the i is less than or equal to number or not
			for(int i=1;i<=n;i++)//incrementing the I value
			{
				if(i%2==0 && i%3==0)//Checking the number is divisible by 2 and 3 
				{
					
					
						System.out.print(i+" ");//displaying the I value
					
				}
			}
			System.out.println(" ");//creating the empty space in the next line
		}
	}
	void OddNumbersDivisibleby5(int n)//10 importing the number
	{
		//if(n>100)//checking the number is greater than 100 or not
		{
			System.out.print("Odd numbers which are divisible by 5 : ");//Display message
			//initializing and checking the I value is less than or equal to number
			for(int i=1;i<=n;i++)//incrementing the I value
			{
				if(i%3==0 && i%2!=0)//checking the I is divisible by 3 and not divisible by 2
				{
					if(i%5==0)//checking the number is divisible by 5 or not
					{
						System.out.print(i+" ");//displaying the value of I
					}
				}
			}
			System.out.println(" ");//creating an empty space in the next line
		}
	}
	

	
}
