package SrihariApp;

public class Employee
{
	String name;
	int Id;
	float salary;
	String gender;
	String teamName;
	

public Employee(String name, int Id, float salary, String gender, String teamName)
{
	this.name = name;
	this.Id = Id;
	this.salary = salary;
	this.gender = gender;
	this.teamName = teamName;
}
void introduce()
{
	System.out.println("Name : "+name);
	System.out.println("Id : "+Id);
	System.out.println("Salary : "+salary);
	System.out.println("Gender : "+gender);
	System.out.println("Team Name : "+teamName);
}
}