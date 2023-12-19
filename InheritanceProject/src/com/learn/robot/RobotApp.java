package com.learn.robot;

public class RobotApp {

	public static void main(String[] args) 
	{
		//Creating the Teacher Robo object and calling the methods
		TeacherRobo tr = new TeacherRobo();
		tr.name ="Hari";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		//Creating the Chef Robo object and calling the methods
		ChefRobo ch = new ChefRobo();
		ch.name = "Raj";
		ch.talk();
		ch.walk();
		ch.charge();
		ch.cook();
		//Creating the Doctor Robo object and calling the methods
		DoctorRobo dr = new DoctorRobo();
		dr.name = "Gayatri";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();	
	}
}
