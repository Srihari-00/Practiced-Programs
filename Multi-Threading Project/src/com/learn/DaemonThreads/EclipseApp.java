package com.learn.DaemonThreads;

public class EclipseApp {

	public static void main(String[] args) 
	{
		Typing ty = new Typing();
		Compilation cmp = new Compilation();
		Saving sav = new Saving();
		
		ty.start();
		cmp.setDaemon(true);
		sav.setDaemon(true);
		cmp.start();
		sav.start();
	}

}
