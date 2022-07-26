package hijava.practice;

public class Star1 {

	public static void main(String[] args) {
		int line = 7;
		// 7단 별삼각형
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j < (i+1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		//7단 별역삼각형
		for(int k = 1; k <= line; k++) {
			for(int l = 1; l <= (line - k); l++) {
				System.out.print(" ");
			}
			for(int m = 1 ; m <= k; m++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
