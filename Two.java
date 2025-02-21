package StringVowelsConsonents;

public class Two {
	public static void main(String args[]) {
		String str="Welcome to java";
		
		int vCount=0;
		int cCount=0;
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch !=' ') 
				
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				vCount++;
			}
			else	if(ch>'a'&&ch<'z') {
				cCount++;
			}
		}
	//	System.out.println("The number of characters in string "+count);
		System.out.println("The number of vowels in string "+vCount);
		System.out.println("The number of  consonents string "+cCount);
		
	}

}



