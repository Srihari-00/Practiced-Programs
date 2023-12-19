package SrihariApp;

public class StudentApp
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "Srihari";
		s1.age = 23;
		s1.rollNo = 19;
		s1.gender = "male";
		s1.percentage = 78.2F;
	
		s1.study();
	
		new Student().study();
	}
	
}
