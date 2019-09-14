package countingelements;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger missing = new MissingInteger();
		System.out.println(missing.solution(new int[] {1, 3, 6, 4, 1, 2}) == 5);
		System.out.println(missing.solution(new int[] {1, 2, 3}) == 4);
		System.out.println(missing.solution(new int[] {-1, -3}) == 1);
	}
	
	public int solution(int[] a) {
		int min = 1;
		Arrays.parallelSort(a);
		if(a[a.length-1] <= 0) {
			return min;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min) {
				min++;
			}
		}
		return min;
    }
	
}
