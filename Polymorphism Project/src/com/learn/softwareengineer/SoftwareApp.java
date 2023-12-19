package com.learn.softwareengineer;

public class SoftwareApp {

	public static void main(String[] args) 
	{
		BackEndDeveloper bd = new BackEndDeveloper();
		FrontEndDeveloper fd = new FrontEndDeveloper();
		JavaDeveloper jd = new JavaDeveloper();
		PythonDeveloper pd = new PythonDeveloper();
		
		doActivity(bd);
		System.out.println("=====================================");
		doActivity(fd);
		System.out.println("=====================================");
		doActivity(jd);
		System.out.println("=====================================");
		doActivity(pd);

	}
	public static void doActivity(SoftwareEngineer se)
	{
		//Calling the inherited Method
		se.testCode();
		//Calling the overridden method
		se.attendMeeting();
		
		if(se instanceof JavaDeveloper)
		{
			//DownCasting-calling the child specialized method using parent type reference
			((JavaDeveloper)(se)).doBackendProject();
			((JavaDeveloper)(se)).learnJava();
			
		}
		else if(se instanceof PythonDeveloper)
		{
			//DownCasting-calling the child specialized method using parent type reference
			((PythonDeveloper)(se)).doBackendProject();
			((PythonDeveloper)(se)).learnPython();
			
		}
		else if(se instanceof BackEndDeveloper)
		{
			//DownCasting-calling the child specialized method using parent type reference
			((BackEndDeveloper)(se)).doBackendProject();
			
			
		}
		else if(se instanceof FrontEndDeveloper)
		{
			//DownCasting-calling the child specialized method using parent type reference
			((FrontEndDeveloper)(se)).doFrontendProject();
			((FrontEndDeveloper)(se)).learnFrontEndlang();
		}
	}

}
