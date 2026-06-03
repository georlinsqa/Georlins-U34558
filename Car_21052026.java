package USTGlobal.SeleniumJava;

public class Car_21052026 {
	
	String Brand = "BMW";
	String Model = "X5";
	int Price = 15000000;
	
	public void startcar() {
	System.out.println("The car "+Brand+" "+Model+" priced at "+Price+" is started");
	}
	
	public void stopcar() {
	System.out.println("The car "+Brand+" "+Model+" priced at "+Price+" is stopped");
	}	

	public static void main(String[] args) {
	
		Car_21052026 c = new Car_21052026();
		c.startcar();
		c.stopcar();

	}

}
