import java.util.*;
public class MarksGreaterThan90App {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = scan.nextInt();
		//creating the object of another class
		MarksGreaterThan90 pr = new MarksGreaterThan90();
		//calling the method using the another class object
		pr.displayMarks(marks);

	}

}
