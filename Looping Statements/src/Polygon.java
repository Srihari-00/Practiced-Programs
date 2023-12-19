
public class Polygon 
{
	void Check(int x)//Passing the input into the method
	{
		//using the switch control construct
		switch(x)
		{
			case 1 : //side =1
				System.out.println("Line");
				break;//breaking the execution
			case 2 : //side = 2
				System.out.println("Polygon");
			case 3 : //side = 3
				System.out.println("Triangle");
				break;
			case 4 ://side = 4
				System.out.println("Quadrilateral");
				break;
			case 5://side = 5
				System.out.println("Pentagon");
				break;
			case 6://side=6
				System.out.println("Hexagon");
				break;
				
			case 7://side=7
				System.out.println("Heptagon");
				break;
				
			case 8 ://side=8
				System.out.println("Regular Polygon");
				break;
				
			case 9 ://side=9
				System.out.println("Decagon");
				break;
				
			case 10://side=10
				System.out.println("Nonogon");
				break;
				
			default://invalid input
				System.out.println("Invalid Input");
	
		
		}
			
	}

}
