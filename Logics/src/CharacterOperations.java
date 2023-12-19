import java.util.Scanner;

public class CharacterOperations {

	public static void main(String[] args) 
	{
		//creating the object of scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character : ");//asking user to enter input
		char obj = scan.next().charAt(0);//accepting the input 
		CharOperation pr = new CharOperation();
		
		pr.UpperCase(obj);
		
		
	}

}
