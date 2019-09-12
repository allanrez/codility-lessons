package countingelements;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		PermCheck check = new PermCheck();
		System.out.println(check.solution(new int[] {4,1,3,2}) == 1);
		System.out.println(check.solution(new int[] {4,4,1,2,3}) == 0);
		System.out.println(check.solution(new int[] {4,1,3}) == 0);
		System.out.println(check.solution(new int[] {4}) == 0);
		System.out.println(check.solution(new int[] {1}) == 1);
	}
	
	public int solution(int[] a) {
		if(a.length == 0) {
			return 0;
		}
		Arrays.parallelSort(a);
		for(int i = 0; i < a.length; i++) {
			if(i+1 != a[i]) {
				return 0;
			}
		}
		return 1;
    }
}
