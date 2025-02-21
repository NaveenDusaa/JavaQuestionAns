//Write a program to check whether a given string or number is a palindrome.

package Palindrone;
import java .util.*;

public class ProgramOne {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
    int num=sc.nextInt();
    int orgNO=num;
   
   int rev=0;
   while(num!=0) {
	   rev=rev*10+num%10;
	   num=num/10;
   }
  if(orgNO==rev) {
	  System.out.println("palindrone"+orgNO);
  }
  else {
	  System.out.println("not palindrone"+orgNO);
  }
      
    	
    
    
    
    
    }
	
	

}
