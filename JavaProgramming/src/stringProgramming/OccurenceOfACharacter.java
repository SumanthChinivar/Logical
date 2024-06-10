package stringProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfACharacter {
	public static void main(String[] args) {
		String s = "aabbbcccaaad";
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		LinkedHashMap<Character, Integer> link = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				if (!link.containsKey(ch)) {
					link.put(ch, 1);
				} else {
					link.put(ch, link.getOrDefault(ch, 1) + 1);
				}
			}
		}

		System.out.println(link);
		
		for(Map.Entry<Character, Integer> a:link.entrySet()) {
			char ch1=a.getKey();
			if(ch==ch1) {
				System.out.println(ch1+" "+a.getValue());
			}
		}
	}
}
