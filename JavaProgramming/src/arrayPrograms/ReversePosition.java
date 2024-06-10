package arrayPrograms;

public class ReversePosition {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7};
	for(int start=0,end=3;start<end;start++,end--) {
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
	}
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
