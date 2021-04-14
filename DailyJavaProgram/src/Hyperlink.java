import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Hyperlink 

{
	
	static void abc(int a)
	{
		System.out.println("abc");
		
	}
	
	static void abc(int a, char c)
	{
		System.out.println("ac");
		
	}
	
  public static void main(String[] args) 
	
	{
		
		List<String> str1= new ArrayList<String>();
		str1.add("abc");
		str1.add("example");
//	      Set<String> str1=new HashSet<String>(); 
//		for(String e: str)
//		{
//			str1.add(e);
		abc(5);
		abc(5,'a');
		
		if (str1.contains("example")) 
		{
            System.out.println("The Keyword is found in given string :" +str1);
        } 
		
		else 
		{
            System.out.println("The Keyword : example : is not found in the string:" + str1);

//	     }
		}
	}
	
}