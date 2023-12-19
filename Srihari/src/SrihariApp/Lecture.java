package SrihariApp;

public class Lecture 
{
	String name ;
	int regNo;
	int age;
	String gender;
	float percentage;
	
	 Lecture(String a, int b, int c, String d,float e)
	{
		name = a;
		regNo = b;
		age = c;
		gender = d;
		percentage = e;
	}
	void teach()
	{
		System.out.println(name+" is teaching "+regNo+" by the reg no"+age+"his age, "+gender+" is his gender,"+percentage+" in his class");
	}
}
