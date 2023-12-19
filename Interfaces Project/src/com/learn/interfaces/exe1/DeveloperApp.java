package com.learn.interfaces.exe1;

public class DeveloperApp {

	public static void main(String[] args) 
	{
		BackendDev bd = new BackendDev();
		FrontendDev fd = new FrontendDev();
		
		callMethods(bd);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		callMethods(fd);
		
	}
	static void callMethods(DeveloperActivities dev )
	{
		dev.knowledge();
		dev.Project();
	}

}
