package hijava.practice;

public class TryThis {

	public static void main(String[] args) {
		
		Man hong = new Man("hong");
	
		hong.buyCoffee(1);
		hong.buyDonut(2);
		System.out.println(hong.toString());
		
		Man john = new Man("john");
		
		john.buyCoffee(2);
		john.buyDonut(1);
		System.out.println(john.toString());
		
		
	}
}


