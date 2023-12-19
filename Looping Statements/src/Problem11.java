import java.util.Scanner;//Importing scanner

public class Problem11 {

	public static void main(String[] args) 
	{
		//creating the scanner class object
		Scanner scan = new Scanner(System.in);
		//asking the user to enter the input
		System.out.println("Enter the age of the Person : ");
		//Creating the object of the separate class
		Ages pr = new Ages();
		//accepting the input from the user
		int age = scan.nextInt();
		
		//using the object ,calling the method in the separate class
		pr.ageCheck(age);
	}

}
