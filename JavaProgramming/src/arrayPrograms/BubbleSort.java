package arrayPrograms;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading the size of the array
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		// creating an array
		int[] a = new int[size];
		// reading the elements of the array
		System.out.println("Enter the " + size + " elements of the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array before sorting:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//sort the array
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
