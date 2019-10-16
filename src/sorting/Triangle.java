package sorting;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println(t.solution(new int[] {10,2,5,1,8,20}) == 1);
		System.out.println(t.solution(new int[] {10,50,5,1}) == 0);
		System.out.println(t.solution(new int[] {5,3,3}) == 1);
	}
	
    public int solution(int[] a) {
    	if(a.length < 3) {
    		return 0;
    	}

    	Arrays.parallelSort(a);
    	for(int i = 2; i < a.length; i++) {
    		if(a[i-2] + (long)a[i-1] > a[i]) {
    			return 1;
    		}
    	}
    	return 0;
    }
    
}
