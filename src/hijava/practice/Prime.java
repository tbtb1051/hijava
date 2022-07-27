package hijava.practice;

public class Prime {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] = " + args[i]);
				
			}
		} 
		
		int total = 0;
		
		for (int num = 2; num <= 100; num++) {
			
			boolean isPrimeNum = isPrime(num);

			if(isPrimeNum)
				total += num;
		}	
		System.out.println("1부터 100까지 숫자 중 소수의 합은 : " + total);
   	
	}

	//소수를 판별하라!!
	private static boolean isPrime(int num) {
		for (int j = 2; j < num; j++) {
			if(num % j == 0) {
				return false;
			}
		}
		return true;
	}

	
	
	
	
}