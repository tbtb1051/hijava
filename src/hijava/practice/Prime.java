package hijava.practice;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] = " + args[i]);
				
			}
		} 
		
		int total = 0;
		
		for (int num = 2; num <= 100; num++) {
			

			if(isPrime(num)) {
				total += num;
			}
		}	
		System.out.println("1부터 100까지 숫자 중 소수의 합은 : " + total);
   	
	}

	//소수를 판별하라!!
	private static ArrayList<Integer> primeList = new ArrayList<>();

	private static boolean isPrime(int num) {
//		for (int j = 2; j < num; j++) {
		for(Integer j : primeList) {
			if(num % j == 0) {
				return false;
			}
		}
		primeList.add(num);
		return true;
	}

	
	
	
	
}
