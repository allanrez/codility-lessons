package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		System.out.println(equalsArray(cr.solution(new int[] {3, 8, 9, 7, 6}, 3), new int[] {9, 7, 6, 3, 8}));
		System.out.println(equalsArray(cr.solution(new int[] {0, 0, 0}, 1), new int[] {0,0,0}));
		System.out.println(equalsArray(cr.solution(new int[] {1, 2, 3, 4}, 4), new int[] {1, 2, 3, 4}));
		System.out.println(equalsArray(cr.solution(new int[] {}, 1), new int[] {}));
	}
	
	public int[] solution(int[] a, int k) {
		if(a.length == 0) {
			return a;
		}
		List<Integer> l = Arrays.stream(a).boxed().collect(Collectors.toList());
		for(int i = 0; i < k; i++) {
			Integer aux = l.remove(l.size()-1);
			l.add(0, aux);
		}
		return l.stream().mapToInt(i->i).toArray();
    }
	
	private static boolean equalsArray(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i< a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
}
