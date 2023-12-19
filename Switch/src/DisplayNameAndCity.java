import java.util.*;
public class DisplayNameAndCity
{

	public static void main(String[] args) 
	{
		//Creating the object of the Scanner class
		Scanner scan =new Scanner(System.in);
		//Asking the user to enter the Name
		System.out.println("Enter the name : ");
		String name = scan.nextLine();
		
		switch(name)
		{
		case "Ajay" :
			System.out.println(name+" Lives in Delhi");
			break;
		case "Ankit":
			System.out.println(name+" Lives in Mumbai");
			break;
		case "Arjun":
			System.out.println(name+" Lives in Hyderabad");
			break;
		case "Aakash":
			System.out.println(name+" Lives in Bangalore");
			break;
		default:
			System.out.println(name+" belongs to India");
		
		}
		
	}

}
