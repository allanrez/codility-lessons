package leader;

public class EquiLeader {

	public static void main(String[] args) {
		EquiLeader el = new EquiLeader();
		System.out.println(el.solution(new int[] {4,3,4,4,4,2}) == 2);
		System.out.println(el.solution(new int[] {0}) == 0);
	}
	
	public int solution(int[] a) {
		if (a.length <= 1) {
			return 0;
		}
		
		int value = -1;
		int size = 0;
		for(int i = 0; i < a.length; i++) {
			if(size == 0) {
				value = a[i];
				size++;
			}else {
				if(value == a[i]) {
					size++;
				}else {
					size--;
				}
			}
		}
		
		if(size <= 0) {
			return 0;
		}
		
		int totLeaderOccurrences = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				totLeaderOccurrences++;
			}
		}
		
		if(totLeaderOccurrences < a.length/2) {
			return 0;
		}
		
		int totNonLeaderOcc = a.length - totLeaderOccurrences;
		int countLeader = 0;
		int countNonLeader = 0;
		int countSeq = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				countLeader++;
			}else {
				countNonLeader++;
			}
			
			if(countLeader > countNonLeader && (totLeaderOccurrences - countLeader) > (totNonLeaderOcc - countNonLeader)) {
				countSeq++;
			}
		}
		
		return countSeq;
	}
	
}