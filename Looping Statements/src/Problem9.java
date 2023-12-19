
public class Problem9 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)//For Schools 
		{
			for(int j=1;j<=2;j++)//For Class
			{
				for(int k=1;k<=10;k++)//for students
				{
					if(i%2!=0 && k%2==0 )//For school is odd and student no. is even
					{
						System.out.println("Student with "+k+" of the class "+j+" of school "+i+" have completed the Assignment :-)");
					}
					else if(i%2==0 && k%2!=0 )//for school is even and student is odd
					{
						System.out.println("Student with "+k+" of the class "+j+" of school "+i+" have not completed the Assignment :-(");
					}
					else
					{
						System.out.println("Student with "+k+" of the class "+j+" of school "+i+" have still doing the Assignment :-|");
					}
				}
			}
		}
		System.out.println("All the Assignments of all students of all the schools have checked");

	}

}
