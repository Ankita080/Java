
public class ReverseInt 
{
	public static void main(String[] args) 
	{		
		int i=123;
		int rev=0;
		
	while(i>0)		
	{
		int temp=i%10;
		if(temp==10)
		   {
			System.out.println("not possible");			
		   }			
		else 
		   {
		   rev=rev*10+temp;	
		   i=i/10;		   
		   }	
     }
	System.out.println(rev);	
   }
}
