package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	
	private String name; // 이름
	private int amount; // 잔액

	public Man() {
		this.amount = 10000;
	}

	public Man(String name) {
		this(); // 생성자 부르는 명령어. 위의 잔액 만원은 한번 더 쓰지않고 생성자 함수를 부른다. (항상 첫번째 줄에 있어야 한다.)
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return this.name + "님의 잔액은 " + this.amount + "원 입니다.";
	}

	public void buyCoffee(int count) {
//		this.amount = this.amount - (count * COFFEE);
//		this.amount -= 3000 * count; 
		this.subAmount(COFFEE, count);
	}

	public void buyDonut(int count) {
//		this.amount = this.amount - (count * DONUT);
//		this.amount -= DONUT * count;
		this.subAmount(DONUT, count);
	}

	private void subAmount(int price, int count) {
		this.amount -= price * count;
	}

	public static void main(String[] args) {

		Man hong = new Man("hong");

		hong.buyCoffee(1);
		hong.buyDonut(2);
		System.out.println(hong);
		

		Man john = new Man("john");

		john.buyCoffee(2);
		john.buyDonut(1);
		System.out.println(john);
	}
}
