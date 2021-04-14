
public class ReveseLine {

	
	
		
		
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		String str="i live in delhi";
		System.out.println(str);
		String newString[]=str.split("\\s") ;
		String rev="";
		for(int i=newString.length-1;i>=0;i--)
			
		{
			
			rev=rev+" "+newString[i];
		}
		System.out.println(rev);
	}

}
