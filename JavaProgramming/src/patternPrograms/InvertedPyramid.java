package patternPrograms;

public class InvertedPyramid {
	public static void main(String[] args) {
		int row=4;
		//print rows
		for(int i=row;i>=1;i--) {
			//print spaces
			for(int j=row-i;j>=1;j--) {
				System.out.print(" ");
			}
			//print *
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
