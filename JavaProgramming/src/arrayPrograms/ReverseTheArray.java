package arrayPrograms;

import java.util.Arrays;

public class ReverseTheArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int low=0,high=a.length-1;
		while(low<high)
		{
			int temp=a[high];
			a[high]=a[low];
			a[low]=temp;
			high--;
			low++;
		}
		System.out.println(Arrays.toString(a));
	}
}
