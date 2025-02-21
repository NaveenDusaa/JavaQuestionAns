package StringReverse;

public class Demo {
	public static void main(String args[]) {
		String str="Nagabhushanam";
		String rev=" ";
	/*	int len=str.length();
		for(int i=len-1;i>=0;i--) 
			rev=rev+str.charAt(i);
			
		
		System.out.println(rev); */
		
		
	/*	char[] a=str.toCharArray();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);  */
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		}

}
