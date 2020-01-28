package stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
	
	public static void main(String[] args) {
		Brackets b = new Brackets();
		System.out.println(b.solution("{[()()]}") == 1);
		System.out.println(b.solution("([)()]") == 0);
	}

    public int solution(String s) {
    	if(s == null) {
    		return 0;
    	}
    	
    	if(s.isEmpty()) {
    		return 1;
    	}
    	
    	Deque<Character> stack = new ArrayDeque<Character>();
    	for(char c: s.toCharArray()) {
    		if(c == '(' || c == '[' || c == '{') {
    			stack.push(c);
    		}else {
    			if(stack.isEmpty()) {
    				return 0;
    			}
    			
    			char last = stack.peek();
    			if((c == ')' && last == '(') || (c == ']' && last == '[') || (c == '}' && last == '{')) {
    				stack.pop();
    			}else {
    				return 0;
    			}
    		}
    	}
    	
    	return stack.isEmpty() ? 1 : 0;
    	
    }
}
