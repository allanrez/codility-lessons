package arrays;
import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		OddOccurrencesInArray odd = new OddOccurrencesInArray();
		System.out.println(odd.solution(new int[] {9,3,9,3,9,7,9}) == 7);
		System.out.println(odd.solution(new int[] {42}) == 42);
		System.out.println(odd.solution(new int[] {2,2,3,3,4}) == 4);
	}
	
	public int solution(int[] a) {
		Arrays.parallelSort(a);
		int unpaired = a[0];
		for(int i = 0; i< a.length; i+=2) {
			if(i == a.length-1 || a[i] != a[i+1]) {
				unpaired =  a[i];
				break;
			}
		}
		return unpaired;
    }
}
