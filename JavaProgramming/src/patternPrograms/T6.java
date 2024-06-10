package patternPrograms;

public class T6 {
	public static void main(String[] args) {
		int rowNum = 4;
		int colNum = 4;
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= colNum; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
}
