package timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		PermMissingElem missing = new PermMissingElem();
		System.out.println(missing.solution(new int[] {2,3,1,5}) == 4);
		System.out.println(missing.solution(new int[] {}) == 1);
		System.out.println(missing.solution(new int[] {1}) == 2);
		System.out.println(missing.solution(new int[] {2}) == 1);
		System.out.println(missing.solution(new int[] {2,3,4}) == 1);
	}
	
	public int solution(int[] a) {
		if(a.length == 0) {
			return 1;
		}
		Arrays.parallelSort(a);
		int missing = a.length +1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != i+1) {
				missing = i+1;
				break;
			}
		}
		return missing;
    }
	
}
