package stringProgramming;

public class CountTheCharacterNumber {
	public static void main(String[] args) {
		String input = "abbaaaccccabc";
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = 1;
			if (!res.contains(ch + "")) {
				res=res+ch;
				for (int j = i + 1; j < input.length(); j++) {
					if (ch == input.charAt(j)) {
						count++;
					}
				}
				res=res+count;
			}
		}
		System.out.println(res);
	}
}