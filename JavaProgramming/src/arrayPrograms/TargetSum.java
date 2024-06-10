package arrayPrograms;

public class TargetSum {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int targetSum=50;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					continue;
				}else if(a[i]+a[j]==targetSum) {
					System.out.print(i+","+j);
				}
			}
			System.out.println();
		}
	}
}
