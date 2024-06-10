package arrayPrograms;

import java.util.Arrays;

public class MergeArrayInZigZag {
	public static void main(String[] args) {
		int[] a= {1,2,3,8,9};
		int[] b= {4,5,6,7};
		int n=a.length+b.length;
		int[] c=new int[n];
		int i=0,j=0,k=0;
		
		for(i=0;i<n;i++) {
			if(i%2==0 && j<a.length) {
				c[i]=a[j];
				j++;
			}else if(k<b.length) {
				c[i]=b[k];
				k++;
			}else {
				c[i]=a[j];
			j++;
			}
		}
		
		
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");
		}
	}
}
