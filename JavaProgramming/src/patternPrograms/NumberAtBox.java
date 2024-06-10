package patternPrograms;

public class NumberAtBox {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int k=1;
			for (int j = 1; j <= 4; j++) {
				if(i==j)
					System.out.print("@ ");
				else {
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
