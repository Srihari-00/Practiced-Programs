package com.learn.DaemonThreads;

public class Saving extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for( ;;)
			{
				System.out.println("Saving the code");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
