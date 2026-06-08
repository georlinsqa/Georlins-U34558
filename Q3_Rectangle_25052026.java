package Assessment_25052026;

public class Q3_Rectangle_25052026 {
	
	//encapsulation is the process of wrapping data members and member functions into a single unit called class 
	//and hiding the data embers from outside world using access specifiers.
	
	// data members should always be private to achieve encapsulation and we can access the data members using the getter and setter methods.
	
	private double length1;
	private double width1;
	
	//getter method for length

		public double getlength() {
			return length1;
		}
		
	//setter method for length
		
		public void setlength(double length) {
			
			this.length1 = length;
		}
		
		//getter method for width

		public double getwidth() {
			return width1;
		}
		
	//setter method for width
		
		public void setwidth(double width) {
			
			this.width1 = width;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q3_Rectangle_25052026 r = new Q3_Rectangle_25052026();
		
		
		//set the value of length and width using the setter method
		
		r.setlength(10.2);
		r.setwidth(7.4);
		
		//get the value of length and width using the getter method
	
		System.out.println("Length is "+ r.getlength());
		System.out.println("Width is "+ r.getwidth());

	}

}
