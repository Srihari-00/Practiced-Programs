
public class CharOperation
{
	void UpperCase(char x)
	{
	
	
			if(x>='A' && x<='Z')//
			{
				if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U' )
				{
					System.out.println("Upper case Oval letter : "+x);
					
				}
				else
				{
					System.out.println("upper case consonants : "+x);
				
				}
			}
			else if(x>='a' && x<='z')
			{
				if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
				{
					System.out.println("Lower case Oval Letter : "+x);
				
				}
				else
				{
					System.out.println("Lower case Consonants : "+x);
				
				}
			}
			else if(x>0 && x<=9 )
			{
				System.out.println("Number : "+x);
				
			}
			else
			{
				System.out.println("Symbol : "+x);
			}
			
		}
	
		
		
	

}
