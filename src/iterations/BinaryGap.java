package iterations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(9) == 2);
		System.out.println(bg.solution(529) == 4);
		System.out.println(bg.solution(20) == 1);
		System.out.println(bg.solution(15) == 0);
		System.out.println(bg.solution(32) == 0);
	}
	
	public int solution(int n) {
		String b = Integer.toBinaryString(n);
		int max = 0;
		Pattern p = Pattern.compile("(?<=1)0+1");
		Matcher m = p.matcher(b);
		while(m.find()) {
			int count = m.group().length()-1;
			if(count > max) {
				max = count;
			}
		}
		return max;
	}
	
	public int solution2(int n) {
		String b = Integer.toBinaryString(n);
		int max = 0;
		if(b.charAt(b.length()-1)=='1') {
			for(int i=0; i< b.length(); i++) {
				if(b.charAt(i) == '1') {
					int count = 0;
					for(int j=i+1; j<b.length(); j++) {
						if(b.charAt(j) == '1') {
							break;
						}
						count++;
					}
					if(count > max) {
						max = count;
					}
				}
			}
		}
		return max;
	}
	
	//Using own method to transform to binary
	public int solution3(int n) {
		String b = transformBinary(n);
		int max = 0;
		Pattern p = Pattern.compile("(?<=1)0+1");
		Matcher m = p.matcher(b);
		while(m.find()) {
			int count = m.group().length()-1;
			if(count > max) {
				max = count;
			}
		}
		return max;
	}
	
	private String transformBinary(int n) {
		if(n > 0) {
			int r = n % 2;
			return r + transformBinary(n/2);
		}
		return "";
	}

	
}
