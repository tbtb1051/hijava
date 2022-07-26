package hijava.practice;

public class Sum100 {

	public static void main(String[] args) {
		sumByWhile();
		sumByFor();
		
		
		// 1~100 까지의 합
//		int sum = 0;
//		
//		for(int i = 0; i<100; i++) {
//			sum = sum + (i + 1);
//		}
//		System.out.println(sum);
//		
		
//		
	}

	private static void sumByFor() {
		int total = 0;
		for(int i = 1; i<=100; i++) {
			System.out.println("i= " + i);
			total = total + i;
		}
		System.out.println("total = " + total);
	}

	private static void sumByWhile() {
		// 강의
//		int i = 0;
//		int total = 0;
//		while(++i <= 100) {
//			total = total + i;
//			System.out.println("i= : " + i + ", total = " + total);
//		}
//		
//		System.out.println("Result is " + total);
		
		// 1~100까지 홀수의 합 강의
		int i =0;
		int sum = 0;
		while(++i < 100) {
			if(i%2 == 0)
				continue;
				sum = sum + i;
				System.out.println("i = " + i + ", sum = " + sum);
			}
		System.out.println("total = " + sum);
	}

}
