package USTGlobal.SeleniumJava;

public class MethodWithparms {
	
	public void add (int a, int b) {
		int c = a+b;
		System.out.println("Addition is :"+c);
	}

	public static void main(String[] args) {
		// Methods with parameters
		
MethodWithparms e = new MethodWithparms ();
e.add(10, 20);

	}

}
