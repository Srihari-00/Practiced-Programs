package factorialofnumber;

public class Factorial 
{
	void factorialofaNumber(int x)//importing the number
	{
		int factorial =1;//initializing the value in a reference variable
		for(int i=1;i<=x;i++)//for is incrementing the value 
		{
			factorial = factorial*i;//Assigning the factorial value by new value as factorial*i
			System.out.println(i);//printing
		}
		//printing
		System.out.println("Factorial of a number is : "+factorial);
	}
}
