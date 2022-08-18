package hijava.oop;

import hijava.practice.Man;

public class American extends Man{

	public American(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("Hello, My name is " + this.getName() + ".");
	}
}

