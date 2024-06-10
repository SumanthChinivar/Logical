package patternPrograms;

public class OppositeDiagnol {
	public static void main(String[] args) {
		int row=4;
		int column=4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if(i+j==row+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
