package hijava.oop;

public class Son extends Mom {
	public Son() {
		super("아들");
	}

	public Son(String name) {
		super(name);
	}

	public void say() {
		System.out.println("Son said ... ");
	}

	public void ttt() {
		System.out.println("tttt");
	}

	public void drinkMilk() {
		System.out.println("우유를 마셔요.");
	}
}
