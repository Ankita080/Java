
public class pattern7 {

	public static void main(String[] args) 
	
	{

		
	    {
	    	char abc='A';
	    	int n=3;
	        // outer loop to handle number of rows
	        for (int i=0; i<n; i++)
	        {	 
	            // inner loop to handle number spaces
	            for (int j=n-i; j>1; j--)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	  
//	              inner loop to handle number of columns
	            for (int j=0; j<=i; j++ )
	            {
	                System.out.print(abc +" ");
	            }
	  
	            // ending line after each row
	            System.out.println();
	            
	            abc++;
	            
	        }
	    }
		
	}

}
