//Write a program to count the number of vowels and consonants in a given string.

package StringVowelsConsonents;

public class VowelsConsonents {
	public static void main(String args[]) {
		String str="Welcome to java";
		int count=0;
		int vCount=0;
		int cCount=0;
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ') {
				count++;
			}
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vCount++;
			}
			if(str.charAt(i)>'a'&&str.charAt(i)<'z') {
				cCount++;
			}
		}
		System.out.println("The number of characters in string "+count);
		System.out.println("The number of vowels in string "+vCount);
		System.out.println("The number of  consonents string "+cCount);
		System.out.println(str.trim());
	}

}
