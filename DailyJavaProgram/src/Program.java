
public class Program {

	public static void main(String[] args) {

		String str="Ankita";
		
		String arr[]=str.split("");
		int n=arr.length;
		String temp="";
		
		for(int i=n-1;i>=0;i--) {
			
			temp=temp+arr[i];
		}
		System.out.println(temp);
	}

}
