package prefixsums;

public class MinAvgTwoSlice {
	
	public static void main(String[] args) {
		MinAvgTwoSlice minAvg = new MinAvgTwoSlice();
		System.out.println(minAvg.solution(new int[] {4, 2, 2, 5, 1, 5, 8}) == 1);
		System.out.println(minAvg.solution(new int[] {10000, -10000}) == 0);
		System.out.println(minAvg.solution(new int[] {-3, -5, -8, -4, -10}) == 2);
	}

	/**
	 * minimal avg slice will be composed by 2 or 3 slices
	 * bigger slices are composed by sub slices of 3 or 2 slices 
	 */
	public int solution(int[] a) {
		int[] p = new int[a.length+1];
		for(int i = 1; i <= a.length; i++) {
			p[i] = p[i-1] + a[i-1];
		}
		double minimal = Double.MAX_VALUE;
		int pos = 0;
		for(int i = 1; i < a.length; i++) {
			double min = (p[i+1] - p[i-1])/2.0;
			if(min < minimal) {
				minimal = min;
				pos = i - 1;
			}
		}
		for(int i = 1; i < a.length-1; i++) {
			double min = (p[i+2] - p[i-1])/3.0;
			if(min < minimal) {
				minimal = min;
				pos = i - 1;
			}
		}
		return pos;
	}
}
