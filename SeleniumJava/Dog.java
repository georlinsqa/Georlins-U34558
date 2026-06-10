package USTGlobal.SeleniumJava;

public class Dog extends Animal{

	void bark() {
	
	System.out.println("Barks");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		
		//data from parent class
		
		d.eat();
		
		//data from child class
		
		d.bark();
	
	}
}
