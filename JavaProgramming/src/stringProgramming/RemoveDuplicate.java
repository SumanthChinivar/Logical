package stringProgramming;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int num=12341223;
		String input=String.valueOf(num);
		String output="";
		for(int i=0;i<input.length();i++) {
			if(output.indexOf(input.charAt(i))==-1) {
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
	}
}
