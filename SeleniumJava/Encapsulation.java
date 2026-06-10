package USTGlobal.SeleniumJava;

public class Encapsulation {
	
	//encapsulation is the process of wrapping data members and member functions into a single unit called class 
	//and hiding the data embers from outside world using access specifiers.
	
	// data members should always be private to achieve encapsulation and we can access the data members using the getter and setter methods.
	
	private double balance1;
	
	//getter method is used to get the value of a private ata member and setter method is used to t the value of a private data member
	
		/**
		 * @return
		 */
		public double getBalance() {
			return balance1;
		}
		
		public void setBalance(double balance) {
			
			//this keyword is used to refer to the current class variable
			this.balance1 = balance;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e = new Encapsulation();
		
		
		//set the value of the balance using the setter method
		
		e.setBalance(10000);
		
		//get the value of balance using the getter method
	
		System.out.println("Balance is "+ e.getBalance());

	}

}
