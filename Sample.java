//program to demonstrate revese number printing in given number
package StringReverse;
import java.util.*;

public class Sample {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int a=sc.nextInt();
		int b=0,rev=0;
		while(a>0) {
			b=a%10;
			rev=rev*10+b;
			a=a/10;
			
		}
		System.out.println(rev);
		}

}
