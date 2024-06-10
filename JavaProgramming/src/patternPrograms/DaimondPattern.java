package patternPrograms;

public class DaimondPattern {
	public static void main(String[] args) {
		int row=4;
		//print rows
		for(int i=1;i<=row;i++) {
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
		
		for(int i=row-1;i>=1;i--) {
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
