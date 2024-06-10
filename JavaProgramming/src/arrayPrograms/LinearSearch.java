package arrayPrograms;

import java.util.Scanner;

public class LinearSearch {
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
			a[i]=sc.nextInt();
		}
		//read an element to be searched
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		//to check if element is present or not
		boolean flag=false;
		//search the element
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				flag=true;
				System.out.println(key+" is found at "+(i+1)+" position");
				break;
			}
		}
		if(flag==false) {
			System.out.println(key+" is not found");
		}
	}
}
