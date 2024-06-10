package stringProgramming;

public class StringExpansion {
	public static void main(String[] args) {
		String input="a5b3c5";
		String output="";
		for(int i=0;i<input.length();i=i+2) {
			char ch=input.charAt(i);
			int ch1=((int)input.charAt(i+1))-48;
			for(int j=1;j<=ch1;j++) {
				output=output+ch;
			}
		}
		System.out.println(output);
	}
}
