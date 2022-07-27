package hijava.practice;

public class TryThis {

	public static void main(String[] args) {
		
		int num = 10;
		for(int i = 0; i <= num; i++) {
			System.out.print(fibo(i) + " ");
		}
		}

	private static int fibo(int num) {
		if(num <= 1) return num;
		
		return fibo(num-1) + fibo(num-2);
	}
}


