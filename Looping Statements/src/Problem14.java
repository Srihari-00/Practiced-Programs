import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		//asking the user to give input
		System.out.println("Enter the sides of a triangle : ");
		//creating the object of another class
		Square pr = new Square();
		//taking the input from the user
		int Breadth=scan.nextInt();
		int Length=scan.nextInt();
		// TODO Auto-generated method stub
		
		//Using the object of another class, calling the method
		pr.check(Breadth, Length);
	}

}
