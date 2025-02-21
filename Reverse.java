
//reverse given string
package StringReverse;

public class Reverse {
	public static void main(String args[]) {
		//USing concat method and using charAt
		String str="Naveen";
		String rev=" ";
		int len=str.length();  //4
		for(int i=len-1;i>=0;i--) //3
			rev=rev+str.charAt(i);
		System.out.println(rev);
		
		
		//This method is direct method 
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Using charArray() method		
		String n="Nagabhushanam";
		String reverse=" ";
		char[] a=n.toCharArray();
		int lengt=n.length();
		for(int j=lengt-1;j>=0;j--) {
			reverse=reverse+a[j];
		}
		System.out.println(reverse);
		
		
	}

}
