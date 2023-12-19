package com.spring.laptop.exe1.SpringEmployee;

public class Employee1 
{
	int e_id;
	String e_name;
	float e_salary;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int e_id, String e_name, float e_salary) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employee1 [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "]";
	}
}
