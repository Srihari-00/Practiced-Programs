import java.util.Scanner;

public class EveryLogics {

	public static void main(String[] args) 
	{
		//creating the object of the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");//asking user to give input
		int num = scan.nextInt();//accepting the input from the user
		//creating the object of another class
		Logics pr = new Logics();
		if(num>100)
		{
			pr.Divisibleby2(num);//using object of another class calling the method Divisible by 2
			pr.Divisiibleby3(num);//using object of another class calling the method divisible by 3
			pr.Divisibleby5(num);//using object of another class calling the method divisible by 5
			pr.Divisibleby2and5(num);//using object of another class, calling the method divisible by 2 and 5
			pr.Divisibleby3andintable5(num);//using object of another class, calling the method divisible by 3 and multiples of 5
			pr.PrimeNumbers(num);//using object of another class, calling the method PrimeNumbers
			pr.EvenPrimeNumbers(num);//using object of another class, calling the method Even prime numbers
			pr.OddPrimeNumbers(num);//using object of another class , calling the method odd prime numbers
			pr.EvennumbersDivisibleby3(num);//using object of another class, calling the method of even numbers divisible by 3
			pr.OddNumbersDivisibleby5(num);//using object of another class, calling the method of odd numbers divisible by 5
		}
		else
		{
			System.out.println("Enter a valid Input");
		}

	}

}
