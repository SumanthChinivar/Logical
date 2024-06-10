package patternPrograms;

public class T5 {
	public static void main(String[] args) {
		int rowNum = 4;
		int colNum = 4;
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= colNum; j++) {
				if(i==j) {
					System.out.print(i);
				}else if(i+1==j || j+1==i) {
					System.out.print("@");
				}else if(i+2==j || j+2==i) {
					System.out.print("#");
				}else if(i+3==j || j+3==i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
