package stacksandqueues;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		StoneWall sw = new StoneWall();
		System.out.println(sw.solution(new int[] {8,8,5,7,9,8,7,4,8}) == 7);
	}
	
	public int solution(int[] h) {
		Stack<Integer> stack = new Stack<Integer>();
		int minNumBlock = 0;
		int size = 0;
		for(int i = 0; i < h.length; i++) {
			while(!stack.isEmpty()) {
				if(h[i] < size) {
					size -= stack.pop();
				}else if(h[i] > size) {
					stack.push(h[i] - size);
					size += stack.peek();
					minNumBlock++;
					break;
				}else {
					break;
				}
			}
			
			if(stack.isEmpty()) {
				stack.push(h[i]);
				minNumBlock++;
				size += h[i];
			}
		}
		return minNumBlock;
    }
	
	public int solution2(int[] h) {
		Stack<Integer> stack = new Stack<Integer>();
		int minNumBlock = 0;
		int size = 0;
		for(int i = 0; i < h.length; i++) {
			if(h[i] > size) {
				stack.push(h[i] - size);
				size += stack.peek();
				minNumBlock++;
			}else {
				while(!stack.isEmpty() && h[i] < size) {
					size -= stack.pop();
				}
				
				if(stack.isEmpty() || h[i] > size) {
					stack.push(h[i] - size);
					size += stack.peek();
					minNumBlock++;
				}
			}
		}
		return minNumBlock;
    }
	
}
