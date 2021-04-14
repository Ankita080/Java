
public class Revese {

	public static void main(String[] args) 
	{

		int orig=1345689;
		int rev=0;
		System.out.println(orig);

		while(orig>=1)
		{
			int temp=orig%10;
			rev= rev*10 + temp;
			
			orig = orig/10;		
	
		}
		
		System.out.println(rev);
	}

}
