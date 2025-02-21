//Write a Java program to calculate the factorial of a given number using recursion.

package FactorialNumber;
import java.util.*;

public class Factors {
	public static void main(String args[]) {
		System.out.println("Enter any Number:");
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=1;
		while(b<a) {
			if(a%b==0) 
				System.out.println(b);
			b++;
		
		}
	}

}
