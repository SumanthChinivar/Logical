package stringProgramming;

public class StringOccurence {
	public static void main(String[] args) {
		String in="aaaabbccaaadef";
		char[] input=in.toCharArray();
		String o="";
		int count=1;
		for(int i=1;i<input.length;i++) {
				if(input[i]==input[i-1]) {
					count++;
				}else { 
					if(count>1) {
					o=o+input[i-1]+count;
					}else {
					o=o+input[i-1];
					}
					count=1;
				}
		}
		if(count>1)
		o=o+input[input.length-1]+count;
		else
			o=o+input[input.length-1];
		System.out.println(o);
	}
}

