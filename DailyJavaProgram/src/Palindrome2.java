
public class Palindrome2 {

	public static void main(String[] args) 
	
	{
	
		String s= "madiam";
		
		int n=s.length();
		
		for(int i=n-1;i>=(n-1);i--)
		{
			for(int j=0;j<=(n-1);j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println("It is a Palindrome");
					--i;

				}
				else
				{
					System.out.println("It is not a Palindrome");
					break;
				}
			}
			
		}

	}

}
