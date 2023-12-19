package evennumbers;

public class Evennumbers
{
	void evenNumberscheck(int x)//passing the num value
	{
		System.out.println("Even Numbers from 1 to "+x+" are :");
		for(int i=1;i<=x;i++)//where i=digits that are to be checked whether it is even or not 
		{
			if(i%2==0)//the number is divisible by 2 then enter the loop 
			{
				System.out.println(i);
			}
		}
	}

}
