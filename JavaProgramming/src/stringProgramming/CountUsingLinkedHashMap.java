package stringProgramming;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountUsingLinkedHashMap {
	public static void main(String[] args) {
		String input="abbaaassggttccssccccabc";
		LinkedHashMap<Character, Integer> output=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<input.length();i++) {
			Character ch=input.charAt(i);
			if(!output.containsKey(ch)) {
				output.put(ch,1);
			}else
				output.put(ch,output.getOrDefault(ch, 1)+1);
		}
		System.out.println(output);
	}
}
