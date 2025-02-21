//Write a Java program to remove duplicate elements from an array.
package RemoveDuplicateArray;

public class Duplicate {
	public static void main (String args[]) {
		int arr[] = {10,20,20,30,30,40,40,50};
		int size=arr.length;
		int j=0;
		for(int i=0;i<size-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++]=arr[i];  // 1 2 3 4 5
			}
		}
		arr[j++]=arr[size-1];
		for(int k=0;k<j;k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	

}
