package hijava.practice;

public class TryThis {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					if(i == j) {
						sum = sum + i;
					}
					break;
				}
			}
			
		}
		System.out.println(sum);
	}

}
