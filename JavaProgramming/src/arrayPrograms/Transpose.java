package arrayPrograms;

public class Transpose {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][] b=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
}
}
