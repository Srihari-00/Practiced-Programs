package com.learn.factorial;
public class Factorial 
{
	static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			//Recursion
			return n*fact(n-1);


		}
	}

}