package com.learn.gcd;

public class GCDofTwoNumbers 
{
	int printGCD(int m, int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return printGCD(n, m%n);
		}
	}

}