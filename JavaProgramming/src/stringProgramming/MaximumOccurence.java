package stringProgramming;

import java.util.Map;

public class MaximumOccurence {
	public static void main(String[] args) {
		String input="Allamma Prabhu Chennakeshava";
		input=input.toLowerCase();
		int max=0;
		char ch1=input.charAt(0);
		for(int i=0;i<input.length();i++) {
			char ch2=input.charAt(i);
			int count=1;
			for(int j=i+1;j<input.length();j++) {
				if(ch2==input.charAt(j)) {
					count++;
				}
			}
			if(count>max) {
				max=count;
				ch1=ch2;
			}
		}
		System.out.println("The character "+ch1+" has appeared "+max+" times.");
	
	}
}
