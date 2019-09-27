package prefixsums;

public class GenomicRangeQuery {
	
	public static void main(String[] args) {
		GenomicRangeQuery grq = new GenomicRangeQuery();
		System.out.println(equalsArray(grq.solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6}), new int[] {2,4,1}));
		System.out.println(equalsArray(grq.solution("AC", new int[] {0,0,1}, new int[] {0,1,1}), new int[] {1,1,2}));
	}

	public int[] solution(String s, int[] p, int[] q) {
		int n = s.length();
		int[][] prefix = new int[n+1][4];
		for(int k = 1; k <= n; k++) {
			int impact = getImpactFactor(s.charAt(k-1));
			prefix[k][impact-1] = 1;
		}
		for(int k = 1; k <= n; k++) {
			for(int j = 0; j < 4; j++) {
				prefix[k][j] += prefix[k-1][j];
			}
		}
		int[] minimals = new int[p.length];
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < 4; j++) {
				//count total
				if(prefix[q[i]+1][j] - prefix[p[i]][j] > 0) {
					minimals[i] = j+1;
					break;
				}
			}
		}
		return minimals;
    }
	
	private int getImpactFactor(char nucleotides) {
		int factor = 0;
		switch (nucleotides) {
		case 'A':
			factor = 1;
			break;
		case 'C':
			factor = 2;
			break;
		case 'G':
			factor = 3;
			break;

		default:
			factor = 4;
			break;
		}
		return factor;
	}

	private static boolean equalsArray(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i< a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
}
