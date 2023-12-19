import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) 
	{
		//creating the scanner class
		Scanner scan = new Scanner(System.in);
		//asking the user to enter the dimensions
		System.out.println("Enter the length and breadth values :");
		//reding the input as length and storing it in Length variable
		double Length = scan.nextDouble();
		//reading the input and storing it in the breadth variable
		double Breadth = scan.nextDouble();
		//creating an object of another class
		Calculate pr = new Calculate();
		
		//using the object of another class, calling the method
		//and storing the returned value in area variable
		double area = pr.AreaofRectangle(Length, Breadth);
		//printing the value area
		System.out.println("Area of a rectangle "+area);
		
		
	}

}
