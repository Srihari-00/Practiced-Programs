package com.learn.table;

public class TableByRecursion 
{
	static void printTable(int n, int times)
	{
		if(times>10 )
		{
			return ;
		}
		else
		{
			System.out.println(n+" x "+times+" = "+(n*times));
			printTable(n,(times+1));
		}
	}
}
