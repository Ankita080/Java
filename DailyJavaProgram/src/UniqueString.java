import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueString {

	public static void main(String[] args) 
	{
		String str="ankita ankita";

				String []str1 =str.split("");
				Set<String> unique= new LinkedHashSet<String>();


				for(String e : str1)

				{
				    unique.add(e);
				
				}
				List<String> unique1=new ArrayList<String>();
				for(String b: unique){
					unique1.add(b);
				}
				
System.out.print(unique);
	}

}
