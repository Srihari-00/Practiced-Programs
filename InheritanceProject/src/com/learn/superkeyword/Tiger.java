package com.learn.superkeyword;

//Tiger class is inherited from the Animal class
public class Tiger extends Animal
{
	String tigerSound = "Tiger Roar";
	
	//Method OverRiding
	void makeSound()
	{
		System.out.println("Tiger is making "+tigerSound);
	}
	
	void accessParentMethod()
	{
		//calling the parent class method using super keyword
		super.makeSound();
	}

}
