package USTGlobal.SeleniumJava;

public class Cat extends Animal{
	
	void meow() {
		System.out.println("Meowing");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		
		//data from parent class
		
		c.eat();
		
		//data from child class
		
		c.meow();
	
	}

}
