package stringProgramming;

import java.util.Scanner;

public class OccurenceUsingNestedLoop {
	public static void main(String[] args) {
		String s = "aabbbcccaaad";
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch+" "+count);
	}
}
