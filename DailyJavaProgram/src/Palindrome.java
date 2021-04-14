
public class Palindrome {

	public static void main(String[] args) 
	
	{
		String s="nitin";
		int n= s.length();
		String rev="";
		for(int i =n-1 ; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
	     }
		
		System.out.println(rev);
	
	
	if (s.equals(rev))
		
        System.out.println(s+" is a palindrome");
	
	
     else
        System.out.println(s+" is not a palindrome");
	
	}
}
  