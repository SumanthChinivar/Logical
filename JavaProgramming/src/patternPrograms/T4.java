package patternPrograms;

public class T4 {
	static int a=10;
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j <= 5) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
