package prefixsums;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv cd = new CountDiv();
		System.out.println(cd.solution(6, 11, 2) == 3);
		System.out.println(cd.solution(11, 345, 17) == 20);
	}
	
	public int solution(int a, int b, int k) {
		// + 1 in case 'a' divisible by 'k' since is inclusive
		return b/k - a/k + (a%k == 0 ? 1 : 0);
    }
	
}
