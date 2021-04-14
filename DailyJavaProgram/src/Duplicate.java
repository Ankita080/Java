import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) 
	
	{
		String str="ankita ankita";
		String str1[]=str.split("");
		int n=str1.length;
		System.out.println(n);
		Set<String> unique=new LinkedHashSet<String>();
	
			for(int j=n-1;j>1;j--)
			{				
				  unique.add(str1[j]);
			}
				  System.out.println(unique);
				
		
	}

}
