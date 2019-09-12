package countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne frog = new FrogRiverOne();
		System.out.println(frog.solution(5, new int[] {1,3,1,4,2,3,5,4}) == 6);
		System.out.println(frog.solution(2, new int[] {2,2,2,2,2}) == -1);
		System.out.println(frog.solution(20, new int[] {}) == -1);
		System.out.println(frog.solution(3, new int[] {1, 3, 1, 3, 2, 1, 3}) == 4);
	}
	
	public int solution(int x, int[] a) {
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0; i <a.length; i++) {
			if(a[i] <= x && s.size() < x) {
				s.add(a[i]);
			}
			if(s.size() == x) {
				return i;
			}
		}
		return -1;
    }
	
}
