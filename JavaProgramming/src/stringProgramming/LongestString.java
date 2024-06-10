package stringProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestString {
	public static void main(String[] args) {
		String s1="How are you macha";
		ArrayList a=new ArrayList();
		int maxLength=0;
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(maxLength<arr[i].length()) {
				maxLength=arr[i].length();
				a.clear();
				a.add(arr[i]);
			}else if(maxLength==arr[i].length()) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}
}
