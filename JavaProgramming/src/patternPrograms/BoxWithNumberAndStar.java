package patternPrograms;

public class BoxWithNumberAndStar {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int k=i;
			for (int j = 1; j <= 3 ; j++) {
				if(j==2)
					System.out.print("* ");
				else
					System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
