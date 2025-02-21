//Write a program to find the largest and smallest numbers in a given array.


package SArrayL;

public class one {
	public static void main(String args[]) {
		int arr[] ={10,50,60,5,40,100};
		int min=arr[0];
		int max=arr[0];
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(arr[i]< min) {
				min=arr[i];
				
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Smallest array:"+" " +min);
		System.out.println("largest arrry:"+ " "+max);
	}
	

}
