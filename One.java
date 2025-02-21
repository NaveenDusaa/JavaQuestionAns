//Write a program to generate the Fibonacci series up to a given number.

package FibonacciSeries;
import java.util.*;
public class One {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a one number");
		int n1=s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a another number");
		int n2=s1.nextInt();
		//int n1=0,n2=1,sum=0;
		int sum=0;
		System.out.println(n1 + " "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
