package com.learn.downcasting;

public class Geometry
{
	void doActivity(Shape sh)
	{
		//Calling inherited Method using parent type reference
		sh.draw();
		//calling OverRidden method using parent type reference
		System.out.println(sh.findArea());
		
		if(sh instanceof Circle)
		{
			//DownCasting - Calling a specialized method of Circle
			System.out.println(((Circle)(sh)).findPerimeter());
		}
		else if(sh instanceof Square)
		{
			//DownCasting - Calling a specialized method of Square
			System.out.println(((Square)(sh)).findPerimeter());
		}
		else if(sh instanceof Rectangle)
		{
			//DownCasting - Calling a specialized method of Rectangle
			System.out.println(((Rectangle)(sh)).findPerimeter());
		}
	}

}
