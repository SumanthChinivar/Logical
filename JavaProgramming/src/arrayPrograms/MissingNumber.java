package arrayPrograms;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a= {1,2,4,5,6,7};
		int reqResult=(7*8)/2;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(reqResult-sum);
	}
}
