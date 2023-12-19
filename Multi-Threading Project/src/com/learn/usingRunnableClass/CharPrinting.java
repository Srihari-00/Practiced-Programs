package com.learn.usingRunnableClass;

public class CharPrinting implements Runnable
{
	@Override
	public void run()
	{
		try
		{
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
	}

}
