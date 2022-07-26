package hijava.practice;

public class Loop1 {

	public static void main(String[] args) {
		int i = 0;
		while(i++ <10) {
			if(i % 2 == 0)
				continue; // 만나는 순간 처음으로 다시 감.
			
			
			if(i>5) {
				break;
			}
			
			if(i%2 == 1)
				System.out.println("TTTTTTTTTTTT>>" + i);
			
		}
		
	}

}
