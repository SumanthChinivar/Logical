package patternPrograms;

public class T7 {
	public static void main(String[] args) {
		int rowNum = 4;
		int colNum = 4;
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= colNum; j++) {
				if(j==1) {
					System.out.print("#");
				}else if(j==2) {
					System.out.print("*");
				}else if(j==3) {
					System.out.print("%");
				}else if(j==4) {
					System.out.print("$");
				}
			}
			System.out.println();
		}
	}
}
