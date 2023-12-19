package com.learn.joinmethod;

public class Reel extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Reel started : ");
			Thread.sleep(2000);
			System.out.println("Reel is happening ");
			Thread.sleep(2000);
			System.out.println("Reel is ended");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
