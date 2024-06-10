package arrayPrograms;

public class TrimProgram {
	public static void main(String[] args) {
		String input="         Srinivas Prasad          ";
		int start=0;
		int end=input.length();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
				start++;
			else
				break;
		}
		
		for(int i=input.length()-1;i>0;i--)
		{
			if(input.charAt(i)==' ')
				end--;
			else
				break;
		}
		
		String output=input.substring(start, end);
		System.out.println(output);
	}
}
