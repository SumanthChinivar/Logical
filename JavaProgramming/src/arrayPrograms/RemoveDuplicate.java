package arrayPrograms;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,1,2,21,13,45};
		HashSet hs=new HashSet();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
	}
}
