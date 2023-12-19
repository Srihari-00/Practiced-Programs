package com.learn.methodhiding;

public class ParentChildApp {

	public static void main(String[] args)
	{
		Parent p1 = new Parent();
		p1.display();
		
		Parent p2 = new Child();
		p2.display();
		
		Child c = new Child();
		c.display();

	}

}
