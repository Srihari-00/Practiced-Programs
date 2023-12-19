import java.util.Scanner;//creating scanner class

public class Problem12 {

	public static void main(String[] args) 
	{
		//creating the scanner class object
		Scanner scan = new Scanner(System.in);
		//asking the user to enter the input
		System.out.println("Enter the number of sides : ");
		//creating the object of the another class
		Polygon pr = new Polygon();
		//accepting the input from the user
		int sides = scan.nextInt();
		
		//calling the method using the class object
		pr.Check(sides);

	}

}
