
public class Fibbonacci 
{
	void fibbonacciSeries(int x)
	{
		int fib1=0, fib2=1;
		int count=x,fib3;
		if(count==1)
		{
			System.out.print(fib1);
		}
		else if(count==2)
		{
			System.out.print(fib1+" "+fib2);
		}
		else
		{
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=count;i++)
			{
				
				fib3=fib1+fib2;
				System.out.print(fib3+" ");
				fib1=fib2;
				fib2=fib3;
			}
		}
	}

}
