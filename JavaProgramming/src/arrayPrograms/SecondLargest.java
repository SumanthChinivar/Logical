package arrayPrograms;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {70,10};
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(largest<a[i]) {
				secLargest=largest;
				largest=a[i];
			}else if(secLargest<a[i] && a[i]<largest) {
				secLargest=a[i];
			}
		}
		System.out.println("The second largest element is:"+secLargest);
	}
}
