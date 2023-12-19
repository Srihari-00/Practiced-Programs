package com.learn.joinmethod;

public class InstagramApp {

	public static void main(String[] args) 
	{
		System.out.println("Instagram is Started");
		Chatting ch = new Chatting();
		Reel re = new Reel();
		//Starting the Threads
		ch.start();
		re.start();
		
		try
		{
			//join() - Keep waits the main thread until all the threads executed
			ch.join();
			re.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Instagram is Ended");
	}

}
