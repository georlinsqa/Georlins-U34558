package Assessment_25052026;

public class Car_25052026 extends Vehicle_25052026 {
	
	 public void drive(String name)
	 {
		System.out.println("I am repairing my "+name+" Car");
	 
	 }
	public static void main(String[] args) {
		// Calls Vehicles drive
		Vehicle_25052026 v = new Vehicle_25052026();
		v.drive("Porsche");
		
		//Calls sub classes overriddren drive
		Car_25052026 c = new Car_25052026();
		c.drive("BMW");

	}

}
