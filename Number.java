//write a program to check whether a given number prime or not
package PrimeNumber;
import java.util.*;

public class Number {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=s.nextInt();
	
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
				if(count==2) {
					System.out.println("prime number");
				}
				else {
					System.out.println("not prime number");
				}
			}
		}
	}


