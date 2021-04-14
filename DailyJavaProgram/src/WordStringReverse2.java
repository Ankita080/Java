public class WordStringReverse2
{
	  public static void main(String[] args)
	   {
	      String str="Today is a beautiful day";
	      String []strArray =str.split("");

//	for(int i=strArray.length-1;i>=0;i--)
//	     
//	  {
//	  System.out.print(  strArray[i]);
//
//	  }
	System.out.println();
	 String temp1,temp2,temp11=null;
	for(int j=strArray.length-1;j>=0;j--)
	     
	  {
	   temp2=strArray[j];
	   temp11= temp11+ temp2;
	  }
	   System.out.println(temp11);

	   }	  
	  
}