package com.practice.fibonacciseries;

public class Fibonacci 
{
	int num;
	public Fibonacci(int num)
	{
		this.num=num;
	}
	void generateFibonacciSeries()
	{
		int f1=0, f2=1,f3=0;
		if(num==1)
		{
			System.out.println(f1);
		}
		else if(num==2)
		{
			System.out.println(f1+" "+f2);
		}
		else
		{
			System.out.print(f1+" "+f2+" ");
			for(int i=3;i<=num;i++)//where i is iterate the numbers
			{
				f3=f1+f2;//addition of fib1 and fib2 gives fib3
				System.out.print(f3+" ");
				f1=f2;//assigning the fib2 value to the fib1
				f2=f3;//assigning the fib3 value to the fib2
			}
		}
	}

}
