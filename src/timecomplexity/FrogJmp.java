package timecomplexity;

public class FrogJmp {

	public static void main(String[] args) {
		FrogJmp frog = new FrogJmp();
		System.out.println(frog.solution(10, 85, 30) == 3);
		System.out.println(frog.solution(15, 85, 30) == 3);
		System.out.println(frog.solution(20, 85, 30) == 3);
		System.out.println(frog.solution(25, 85, 30) == 2);
		System.out.println(frog.solution(1, 1, 1) == 0);
		System.out.println(frog.solution(1, 1000000000, 1) == 999999999);
	}
	
	public int solution(int x, int y, int d) {
		int miss = y - x;
		return (int) Math.ceil(miss/(double)d);
    }
	
}
