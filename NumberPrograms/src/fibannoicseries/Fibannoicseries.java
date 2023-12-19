package fibannoicseries;

public class Fibannoicseries 
{
	void printFibannoicseries(int x)//passing the parameters
	{
		int fib1=0, fib2=1;//initializing the values
		int count=x,fib3;
		if(count==1)//if required digit is 1
		{
			System.out.print(fib1);
		}
		else if(count==2)//if two digits are required
		{
			System.out.print(fib1+" "+fib2);
		}
		else
		{
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=x;i++)//where i is iterate the numbers
			{
				fib3=fib1+fib2;//addition of fib1 and fib2 gives fib3
				System.out.print(fib3+" ");
				fib1=fib2;//assigning the fib2 value to the fib1
				fib2=fib3;//assigning the fib3 value to the fib2
			}
		}
	}

}
