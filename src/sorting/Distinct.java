package sorting;

import java.util.Arrays;

public class Distinct {
	
	public static void main(String[] args) {
		Distinct d = new Distinct();
		System.out.println(d.solution(new int[] {2,1,1,2,3,1}) == 3);
//		System.out.println(d.solution(new int[] {-5,5,-5,4}) == 125);
	}
	
    public int solution(int[] a) {
    	if(a.length == 0) {
    		return 0;
    	}
    	
    	Arrays.parallelSort(a);
    	int distinct = 1;
    	for(int i = 1; i < a.length; i++) {
    		if(a[i] != a[i-1]) {
    			distinct++;
    		}
    	}
    	return distinct;
    }
}
