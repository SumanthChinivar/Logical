package arrayPrograms;

import java.util.Arrays;

public class SwapElements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int[] b=swap(a,1,2);

		System.out.println(Arrays.toString(b));
	}
	
	public static int[] swap(int[] a,int index1,int index2)
	{
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
		return a;
	}
}