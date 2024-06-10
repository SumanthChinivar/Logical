package patternPrograms;

public class T9 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				num = num + i - 1;
				for (int j = 1; j <= 5; j++) {
					if (i > j) {
						System.out.print(num + "*");
						num--;
					} else if (i == j) {
						System.out.print(num);
						num--;
					} else {
						System.out.print(" ");
					}
				}
			} else {
				num = num + i;
				for (int j = 1; j <= 5; j++) {
					if (i > j) {
						System.out.print(num + "*");
						num++;
					} else if (i == j) {
						System.out.print(num);
						num++;
					} else {
						System.out.print(" ");
					}

				}
			}
			System.out.println();
		}
	}
}
