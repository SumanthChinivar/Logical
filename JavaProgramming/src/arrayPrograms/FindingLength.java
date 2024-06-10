package arrayPrograms;

public class FindingLength {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int count=0;
		for(int i =0;;i++) {
			try {
				int value=a[i];
				count++;
			}catch(ArrayIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println(count);
	}
}
