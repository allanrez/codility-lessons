package prefixsums;

public class PassingCars {

	public static void main(String[] args) {
		PassingCars cars = new PassingCars();
		System.out.println(cars.solution(new int[] {0,1,0,1,1}) == 5);
		System.out.println(cars.solution(new int[] {0,1,0,1,1,0}) == 5);
		System.out.println(cars.solution(new int[] {0,1,0,1,1,0,0}) == 5);
		System.out.println(cars.solution(new int[] {0,1,0,1,1,0,0,1}) == 9);
		int[] a = new int[100000];
		for(int i =0;i<a.length;i++) {
			if(i>49999) {
				a[i] = 1;
			}else {
				a[i] = 0;
			}
		}
		System.out.println(cars.solution(a) == -1);
	}
	
	public int solution(int[] a) {
		int numberOfPair = 0;
		int counts = 0;
		for(int i = a.length-1; i >= 0; i--) {
			if(a[i] == 1) {
				counts++;
			}else {
				numberOfPair += counts;
				
				if(numberOfPair > 1000000000) {
					return -1;
				}
			}
		}
		return numberOfPair;
    }
}
