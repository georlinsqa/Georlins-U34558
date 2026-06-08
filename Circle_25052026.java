package Assessment_25052026;

public class Circle_25052026 extends Shape_25052026{
	
	void circle() {
		System.out.println("The circle is a perfect round shape");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_25052026 c = new Circle_25052026();
		
		//data from parent class
		
		c.shape();
		
		//data from child class
		
		c.circle();
	
	}

}
