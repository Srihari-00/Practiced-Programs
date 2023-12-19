package com.spring.laptop.exe1.SpringEmployee;

public class Employee2 
{
	int e_id;
	String e_name;
	float e_salary;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public float getE_salary() {
		return e_salary;
	}
	public void setE_salary(float e_salary) {
		this.e_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employee2 [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "]";
	}
	

}
