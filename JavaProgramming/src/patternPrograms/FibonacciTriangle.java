package patternPrograms;

public class FibonacciTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int a=1;
			int b=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}
