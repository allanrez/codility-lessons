package timecomplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium tape = new TapeEquilibrium();
		System.out.println(tape.solution(new int[] {3,1,2,4,3}) == 1);
		System.out.println(tape.solution(new int[] {}) == 0);
		System.out.println(tape.solution(new int[] {-1000,1000}) == 2000);
	}
	
	public int solution(int[] a) {
		if(a.length == 0) {
			return 0;
		}
		int secondSum = 0;
		for(int i = 0; i< a.length; i++) {
			secondSum += a[i];
		}
		int firstSum = 0;
		int min = Integer.MAX_VALUE;
		int p = a.length -1;
		for(int i = 0; i < p; i++) {
			firstSum += a[i];
			secondSum -= a[i];
			int diff = Math.abs(firstSum - secondSum);
			if(diff < min) {
				min = diff; 
			}
		}
		
		return min;
    }
}
