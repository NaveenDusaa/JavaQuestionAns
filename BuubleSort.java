//Write a Java program to sort an array using Bubble Sort or any other sorting algorithm.
package Sorting;

public class BuubleSort {
	public static void main(String args[]) {
		int a[] ={100,20,50,70,60,80};
		int size=a.length;
		int temp=0;
		System.out.println("Before Sorting");
		for (int b:a) {
			System.out.print(b + " ");
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {  // this index -1 loop is stopped 
				if(a[j]>a[j+1]) { // this j+1 moves to the next elements by sorting
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println( );
		System.out.println("After Sorting");
		for(int b:a) {
			System.out.print(b +" ");
		}
	}

}
