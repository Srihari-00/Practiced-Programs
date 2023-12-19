package com.practice.inheritance;

public class Number 
{
	int num;
	
	public Number(int num)
	{
		this.num=num;
	}
	
	void calculateFactors()
	{
		int count=0;
		System.out.print("Factors of "+num+" is : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.print(count);
	}

}
