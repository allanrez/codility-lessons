package countingelements;

public class MaxCounters {
	
	public static void main(String[] args) {
		MaxCounters max = new MaxCounters();
		System.out.println(equalsArray(max.solution(5, new int[] {3,4,4,6,1,4,4}), new int[] {3, 2, 2, 4, 2}));
		System.out.println(equalsArray(max.solution(5, new int[] {}), new int[] {0,0,0,0,0}));
	}

	public int[] solution(int n, int[] a) {
		int[] counter = new int[n];
		int max = 0;
		int lastMax = 0;
		boolean maximize = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > n) {
				maximize = true;
				lastMax = max;
			}else {
				if(maximize && counter[a[i]-1] < lastMax) {
					counter[a[i]-1] = lastMax;
				}
				counter[a[i]-1] += 1; 
				if(counter[a[i]-1] > max) {
					max = counter[a[i]-1];
				}
			}
		}
		
		if(maximize) {
			for(int i = 0; i < counter.length; i++) {
				if(counter[i] < lastMax) {
					counter[i] = lastMax;
				}
			}
		}
		return counter;
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
