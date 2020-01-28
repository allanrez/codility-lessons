package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {

	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {0,1,0,0,0}) == 2);
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {0,0,1,0,0}) == 3);
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {1,0,0,0,0}) == 1);
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {0,0,0,0,1}) == 5);
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {1,0,1,1,1}) == 4);
		System.out.println(f.solution(new int[] {4,3,2,1,5}, new int[] {0,1,1,0,0}) == 2);
	}
	
	public int solution(int[] a, int[] b) {
		if(a.length == 0 || b.length == 0) {
			return 0;
		}
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int alive = 0;
		for(int q = 0; q < a.length; q++) {
			if(b[q] == 0) {
				while(!stack.isEmpty()) {
					if(a[stack.peek()] < a[q]) {
						stack.pop();
					}else {
						break;
					}
				}
				
				if(stack.isEmpty()) {
					alive++;
				}
			}else {
				stack.push(q);
			}
		}
		
		return alive + stack.size();
    }
}
