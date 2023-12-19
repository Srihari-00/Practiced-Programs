
public class Ages
{
	void ageCheck(int x)//passing the input
	{
		if(x>=0 && x<=12)//checking the number range is between 0-12
		{
			System.out.println("Child");
		}
		else if(x>12 && x<=19)//checking the range is between 13-19
		{
			System.out.println("Teen");
		}
		else if(x>19 && x<=59)//checking the range is between 20-59
		{
			System.out.println("Adult");
		}
		else if(x>59)//checking the age is greater than 59 or not
		{
			System.out.println("Senior Citizen");
		}
		else//asking the user to enter valid input
		{
			System.out.println("Enter valid age");
		}
	}

}
