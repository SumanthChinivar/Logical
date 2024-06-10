package arrayPrograms;

public class FrequencyWithoutHashMap {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,2,1};
		int[] freq=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int k=a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==k) {
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(freq[i]!=-1) {
				System.out.println(a[i]+" has occured "+freq[i]+" times");
			}
		}
	}
}
