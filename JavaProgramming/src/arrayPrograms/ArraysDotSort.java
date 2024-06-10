package arrayPrograms;

import java.util.Arrays;

public class ArraysDotSort {
	public static void main(String[] args) {
//		int[] a= {2,3,1,6,5};
		
		String[] a= {"Navya","Ramya","Sowmya","Bavya"};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
