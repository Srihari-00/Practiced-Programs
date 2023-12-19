package com.learn.singlerunThreadclass;

public class Program extends Thread
{
	@Override
	public void run()
	{
		//if the Thread name is Number call numPrinting method
		if(currentThread().getName().equals("Number"))
		{
			numPrinting();
		}
		//if the Thread name is Character call charPrinting method
		else
		{
			charPrinting();
		}
	}
	public void numPrinting()
	{
		try
		{
			System.out.println("Number printing started");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Number : "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Number printing Ended");
	}
	public void charPrinting()
	{
		try
		{
			System.out.println("Character Printing started");
			for(char i='a';i<='e';i++)
			{
				System.out.println("Character : "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Character Printing Ended");
	}

}
