package arrayPrograms;

import java.util.HashMap;

public class FrequencyUsingHashMap {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 1, 2 };
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			if (!hs.containsKey(k)) {
				hs.put(k, 1);
			} else
				hs.put(k, hs.get(k) + 1);
		}

		System.out.println(hs);
	}
}
