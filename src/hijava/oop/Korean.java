package hijava.oop;

import hijava.practice.Man;

public class Korean extends Man{

	public Korean(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("안녕하세요, 제 이름은 " + this.getName() + "입니다.");
	}
}
