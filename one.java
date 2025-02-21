//Write a program to check if a number is an Armstrong number (e.g., 153 = 1^3 + 5^3 + 3^3).


package Armstrong;
import java.util.*;

public class one {
	public static void main(String args[]) {
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int rev ,sum=0;
		while(num>0) {
			rev=num%10;
			num=num/10;
			sum=sum+rev*rev*rev;
			
			
		}
		if(temp==sum) {
			System.out.println("it amstrong number");
		}
		else {
			System.out.println("not amstrong number");
		}
	}
  
}
