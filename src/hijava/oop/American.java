package hijava.oop;

import hijava.practice.Man;

public class American extends Man{
	public American(String name) {
		this.setName(name);
	}
	public void sayHello() {
		System.out.println("Hello, My name is " + this.getName() + ".");
	}
	public void eatBread() {
		System.out.println("Eating Bread");
	}
}

