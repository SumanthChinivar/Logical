package arrayPrograms;

import java.util.Scanner;

public class BinarySearch {
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
		// read an element to be searched
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		// to check if element is present or not
		boolean flag = false;
		// declare low,high,mid
		int low = 0, high = a.length - 1, mid;
		// searching the element
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == key) {
				flag = true;
				System.out.println(key + " is found at " + (mid + 1) + " position");
				break;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			}
		}
		if (flag == false) {
			System.out.println(key + " is not found");
		}
	}
}
