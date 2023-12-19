import java.util.Scanner;//Creating the scanner class

public class Problem13 {

	public static void main(String[] args)
	{
		//creating the scanner class object
		Scanner scan = new Scanner(System.in);
		//asking the user to enter the input
		System.out.println("Enter the code : ");
		//Creating the object of the another class
		Product pr = new Product();
		String code = scan.nextLine();//taking the input from the user
		
		//using the object of another class, calling the method
		pr.Check(code);

	}

}
