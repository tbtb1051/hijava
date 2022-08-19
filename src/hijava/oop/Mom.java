package hijava.oop;

public class Mom {
	private String name;

	public Mom(String name) {
		this.name = name;
	}

	public Mom() {
		this("엄마");
	}

	public String getName() {
		return this.name;
	}

	public void drinkBeer() {
		System.out.println("맥주를 마셔요.");
	}

	public void eat() {
		System.out.println("EAT!!");
	}

	public void say() {
		System.out.println("Mom said ... ");
	}
}
