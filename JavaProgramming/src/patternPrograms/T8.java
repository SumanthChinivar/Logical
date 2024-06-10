package patternPrograms;

public class T8 {
	public static void main(String[] args) {
		int rowNum = 4;
		int colNum = 4;
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= colNum; j++) {
				if(i==1) {
					System.out.print("#");
				}else if(i==2) {
					System.out.print("*");
				}else if(i==3) {
					System.out.print("%");
				}else if(i==4) {
					System.out.print("$");
				}
			}
			System.out.println();
		}
	}
}
