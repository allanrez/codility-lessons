package sorting;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		MaxProductOfThree max = new MaxProductOfThree();
		System.out.println(max.solution(new int[] {-3,1,2,-2,5,6}) == 60);
		System.out.println(max.solution(new int[] {-5,5,-5,4}) == 125);
	}
	
	public int solution(int[] a) {
		Arrays.parallelSort(a);
		int max = a[a.length-1] * a[a.length-2] * a[a.length-3];
		int max2 = a[a.length-1] * a[1] * a[0];
		return Math.max(max, max2);
    }
	
	//without sorting
	public int solution2(int[] a) {
		int max = Integer.MIN_VALUE, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max2 = max1;
				max1 = max;
				max = a[i];
			}else if(a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			}else if(a[i] > max2) {
				max2 = a[i];
			}
			
			if(a[i] < min) {
				min1 = min;
				min = a[i];
			}else if(a[i] < min1) {
				min1 = a[i];
			}
		}
		int prod = max * max1 * max2;
		int prod1 = min * min1 * max;
		return Math.max(prod, prod1);
    }
}
