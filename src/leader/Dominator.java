package leader;

public class Dominator {

	public static void main(String[] args) {
		Dominator d = new Dominator();
		System.out.println(d.solution(new int[] {3,4,3,2,3,-1,3,3}) == 6);
	}
	
	public int solution(int[] a) {
		if (a.length == 0) {
			return -1;
		}
		
		int index = -1;
		int value = -1;
		int size = 0;
		for(int i = 0; i < a.length; i++) {
			if(size == 0) {
				value = a[i];
				size++;
				index = i;
			}else {
				if(value == a[i]) {
					size++;
				}else {
					size--;
				}
			}
		}
		
		if(size <= 0) {
			return -1;
		}
		
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				count++;
			}
		}
		
		if(count > a.length/2) {
			return index;
		}
		return -1;
		
    }
	
}
