package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nesting {

	public static void main(String[] args) {
		Nesting n = new Nesting();
		System.out.println(n.solution("(()(())())") == 1);
		System.out.println(n.solution("())") == 0);
	}
	
	public int solution(String s) {
		if(s == null) {
    		return 0;
    	}
    	
    	if(s.isEmpty()) {
    		return 1;
    	}
    	
    	Deque<Character> stack = new ArrayDeque<Character>();
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(c == '(') {
    			stack.push(c);
    		}else {
    			if(stack.isEmpty()) {
    				return 0;
    			}
    			
				stack.pop();
    		}
    	}
    	
    	return stack.isEmpty() ? 1 : 0;
    }
	
}
