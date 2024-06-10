package stringProgramming;

import java.util.Stack;

public class BalancedParanthesis {
	public static void main(String[] args) {
		String s1="[{(})]";
		Stack<Character> st=new Stack();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			
			//pushing a opening paranthesis to the stack
			if(ch=='[' || ch=='{' || ch=='(') {
				st.push(ch);
			}
			
			//checking if stack is empty
			if(st.isEmpty()) {
				System.out.println("Brackets are not balanced");
				return;
			}
			
			//popping the closing brackets from the stack
			char check;
			
			switch(ch) {
			case ')':
				check=st.pop();
				if(check=='{' || check=='[') {
					System.out.println("Brackets are not balanced");
					return;
				}
				break;
			case '}' :
				check=st.pop();
				if(check=='(' || check=='[') {
					System.out.println("Brackets are not balanced");
					return;
				}
				break;
			case ']':
				check=st.pop();
				if(check=='{' || check=='(') {
					System.out.println("Brackets are not balanced");
					return;
				}
				break;
			}
		}
		if(st.isEmpty()) {
			System.out.println("Brackets are balanced");
		}else
			System.out.println("Brackets are not balanced");
	}
}
